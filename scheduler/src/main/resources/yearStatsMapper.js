function() {

    for(var i = 0; i < this.monthsStats.length; i++){
        if(this.monthsStats[i].aggId.substring(0, 4) != aggId) continue;

        var key = aggId;
        var value = {
            min: this.monthsStats[i].min,
            max: this.monthsStats[i].max,
            avg: this.monthsStats[i].avg,
            median: this.monthsStats[i].median
        };
        emit(key, value);
    }
}