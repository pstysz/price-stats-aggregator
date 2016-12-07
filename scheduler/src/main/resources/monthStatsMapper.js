function() {

    for(var i = 0; i < this.daysStats.length; i++){
        if(this.daysStats[i].aggId.substring(0, 6) != aggId) continue;

        var key = aggId;
        var value = {
            min: this.daysStats[i].min,
            max: this.daysStats[i].max,
            avg: this.daysStats[i].avg,
            median: this.daysStats[i].median
        };
        emit(key, value);
    }
}