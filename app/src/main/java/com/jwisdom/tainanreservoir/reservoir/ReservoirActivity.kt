package com.jwisdom.tainanreservoir.reservoir

import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.jwisdom.tainanreservoir.R
import com.jwisdom.tainanreservoir.databinding.ActivityReservoirBinding

class ReservoirActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reservoir)

        var reservoirBinding = DataBindingUtil.setContentView<ActivityReservoirBinding>(this, R.layout.activity_reservoir)
        ReservoirViewModel(this, reservoirBinding)

    }
}
