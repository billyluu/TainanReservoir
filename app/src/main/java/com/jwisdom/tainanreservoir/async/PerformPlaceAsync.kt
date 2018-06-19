package com.jwisdom.tainanreservoir.async

import android.os.AsyncTask

class PerformPlaceAsync: AsyncTask<String, Void, String>() {

    override fun doInBackground(vararg params: String?): String {
        return Http().doGet(params.get(0)!!)
    }

}