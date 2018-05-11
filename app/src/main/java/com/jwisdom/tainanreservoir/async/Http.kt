package com.jwisdom.tainanreservoir.async

import okhttp3.OkHttpClient
import okhttp3.Request

class Http{

    private var client: OkHttpClient

    constructor() {
        client = OkHttpClient()
    }

    fun doGet(url: String) :String {
        var req = Request.Builder()
                .url(url)
                .build()

        return client.newCall(req).execute().body()!!.string()
    }
}