package com.jwisdom.tainanreservoir.performplace

import android.util.Log
import com.jwisdom.tainanreservoir.async.PerformPlaceAsync
import com.jwisdom.tainanreservoir.reservoir.Reservoir
import com.squareup.moshi.Moshi
import com.squareup.moshi.Types

class PerformPlace {

    var PLACE_NAME = ""
        get() = field
        set(value) { field = value }

    var ADDRESS = ""
        get() = field
        set(value) { field = value }

    var MANAGER_UTILS = ""
        get() = field
        set(value) { field = value }

    var APPLY_UNIT = ""
        get() = field
        set(value) { field = value }

    var CONTACTOR = ""
        get() = field
        set(value) { field = value }

    var OFFICE_PHONE = ""
        get() = field
        set(value) { field = value }

    var FAX = ""
        get() = field
        set(value) { field = value }

    var EMAIL = ""
        get() = field
        set(value) { field = value }

    var REGISTER = ""
        get() = field
        set(value) { field = value }

    var IMAGE_URL = ""
        get() = field
        set(value) { field = value }


    fun getData(): List<PerformPlace>? {
        var str = PerformPlaceAsync().execute("https://cloud.culture.tw/frontsite/trans/SearchPerformPlaceAction.do?method=doFindPerformPlaceTypeJ").get()
        var type = Types.newParameterizedType(List::class.java, PerformPlace::class.java)
        var adapter = Moshi.Builder().build().adapter<List<PerformPlace>>(type)
        Log.i("TAG SIZE", "${adapter.fromJson(str)!!.size}")
        return adapter.fromJson(str)

    }
}