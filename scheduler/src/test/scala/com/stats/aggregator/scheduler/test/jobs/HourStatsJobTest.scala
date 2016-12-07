package com.stats.aggregator.scheduler.test.jobs

import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

import com.stats.aggregator.scheduler.jobs.HourStatsJob
import com.stats.aggregator.scheduler.repo.contract.{TFilterQueryRepository, TStatsRepository}
import com.stats.aggregator.scheduler.services.contract.TRestApiClient
import org.mockito.Mockito._

import org.scalatest.FlatSpec
import org.scalatest.mockito.MockitoSugar

/**
  * Tests HourStatsJob class
  */
class HourStatsJobTest extends FlatSpec with MockitoSugar {

  def fixture =
    new {
      val statsRepository: TStatsRepository =  mock[TStatsRepository]
      val filterQueryRepository: TFilterQueryRepository = mock[TFilterQueryRepository]
      val restApiClient: TRestApiClient = mock[TRestApiClient]
      val now: String = LocalDateTime.of(2016, 12, 12, 12, 0, 0).format(DateTimeFormatter.ofPattern("yyyyMMddHH"))
      val hourStatsJob: HourStatsJob = new HourStatsJob(filterQueryRepository, restApiClient, statsRepository)
    }

  behavior of "A HourStatsJobTest"

  it should "calculate stats for current hour" in {
    val f = fixture
    val queryId = "1"
    val decimals = List(BigDecimal("3"), BigDecimal("1"), BigDecimal("5"), BigDecimal("2"), BigDecimal("4"))
    when(f.filterQueryRepository.getValidFilterQueryIds).thenReturn(List(queryId))
    when(f.restApiClient.getCurrentPrices(queryId)).thenReturn(decimals)
    doNothing().when(f.statsRepository).saveHourStats(queryId, f.now, BigDecimal("1"), BigDecimal("5"), BigDecimal("3"), BigDecimal("3"))

    f.hourStatsJob.calculate(f.now)

    verify(f.filterQueryRepository, times(1)).getValidFilterQueryIds
    verify(f.restApiClient, times(1)).getCurrentPrices(queryId)
    verify(f.statsRepository, times(1)).saveHourStats(queryId, f.now,
      BigDecimal("1").setScale(2, BigDecimal.RoundingMode.HALF_UP),
      BigDecimal("5").setScale(2, BigDecimal.RoundingMode.HALF_UP),
      BigDecimal("3").setScale(2, BigDecimal.RoundingMode.HALF_UP),
      BigDecimal("3").setScale(2, BigDecimal.RoundingMode.HALF_UP))
  }

  it should "throw IllegalArgumentException if incorrect hourId has been passed" in {
    assertThrows[IllegalArgumentException] {
      val f = fixture
      f.hourStatsJob.calculate("inProp")
    }
  }

}
