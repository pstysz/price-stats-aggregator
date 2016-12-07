function (key, values) {

    var getmedian = function (args) {
        if (!args.length) {return 0};
        var numbers = args.slice(0).sort((a,b) => a - b);
        var middle = (numbers.length / 2) | 0;
        var iseven = numbers.length % 2 === 0;
        return iseven ? (numbers[middle] + numbers[middle - 1]) / 2 : numbers[middle];
    };

    var reducedVal = {
        min: null,
        max: 0,
        avg: 0,
        median: 0
    };

    var avgCount = 0;
    var avgSum = 0;
    var medianArr = [];

    for (var idx = 0; idx < values.length; idx++) {

        var mapAvgValue = Number(values[idx].avg);
        var mapMinValue = Number(values[idx].min);
        var mapMaxValue = Number(values[idx].max);
        var mapMedianValue = Number(values[idx].median);

        if(mapAvgValue > 0){
            avgCount++;
            avgSum += mapAvgValue;
        }

        if(mapMinValue > 0 && ( reducedVal.min === null || mapMinValue < reducedVal.min)){
            reducedVal.min = mapMinValue;
        }

        if(mapMaxValue > 0 && mapMaxValue > reducedVal.max){
            reducedVal.max = mapMaxValue;
        }

        if(mapMedianValue > 0){
            medianArr.push(mapMedianValue);
        }
    }

    if (reducedVal.min === null || isNaN(reducedVal.min)){
        reducedVal.min = 0;
    }

    reducedVal.avg = avgSum / avgCount;

    if (isNaN(reducedVal.avg)){
        reducedVal.avg = 0;
    }

    //It doesn't make much sense (calculates median of medians), but it's just a hadoop demo, not median-calculating-demo
    reducedVal.median =  getmedian(medianArr);
    return reducedVal;
}