package com.jwisdom.tainanreservoir.Performplace

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.jwisdom.tainanreservoir.R
import com.jwisdom.tainanreservoir.databinding.ActivityPerformPlaceBinding

class PerformPlaceActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_perform_place)

        var binding = DataBindingUtil.setContentView<ActivityPerformPlaceBinding>(this, R.layout.activity_perform_place)
        PerformPlaceViewModel(binding)
    }
}