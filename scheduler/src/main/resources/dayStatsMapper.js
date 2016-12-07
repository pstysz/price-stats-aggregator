function() {

    for(var i = 0; i < this.daysStats.length; i++){
        if(this.daysStats[i].aggId != aggId) continue;

        for(var h in this.daysStats[i].hours)
        {
            var key = aggId;
            var value = {
                min: this.daysStats[i].hours[h].min,
                max: this.daysStats[i].hours[h].max,
                avg: this.daysStats[i].hours[h].avg,
                median: this.daysStats[i].hours[h].median
            };
            emit(key, value);
        }
    }
}