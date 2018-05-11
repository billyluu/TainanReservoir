package com.jwisdom.tainanreservoir.reservoir

import com.jwisdom.tainanreservoir.async.ReservoirAsync
import com.squareup.moshi.Moshi
import com.squareup.moshi.Types

class Reservoir {

    var RESERVOIR_NAME = ""
        get() = field
        set(value) { field = value}

    var PUBLISHTIME = ""
        get() = field
        set(value) { field = value}

    var FULL_WATER_LEVEL = ""
        get() = field
        set(value) { field = value}

    var WATER_LEVEL = ""
        get() = field
        set(value) { field = value}


    fun getData(): List<Reservoir> {
        var result = ReservoirAsync().execute("http://210.69.40.35/api/api/reservoir").get()
        var moshi = Moshi.Builder().build()
        var type = Types.newParameterizedType(List::class.java, Reservoir::class.java)
        var adapter = moshi.adapter<List<Reservoir>>(type)
        var list = adapter.fromJson(result)

        return list!!
    }
}