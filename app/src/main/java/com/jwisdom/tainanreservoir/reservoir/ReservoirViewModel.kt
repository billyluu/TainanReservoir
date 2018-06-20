package com.jwisdom.tainanreservoir.reservoir

import android.arch.lifecycle.ViewModel
import android.content.Context
import android.content.Intent
import android.view.View
import com.jwisdom.tainanreservoir.performplace.PerformPlaceActivity
import com.jwisdom.tainanreservoir.databinding.ActivityReservoirBinding

class ReservoirViewModel: ViewModel {
    private var context: Context
    private var binding: ActivityReservoirBinding

    constructor(context: Context, binding: ActivityReservoirBinding) {
        this.context = context
        this.binding = binding
        initMyAdapter(Reservoir().getData())
    }

    fun initMyAdapter(list: List<Reservoir>) {
        var myAdapter = MyAdapter(list)
        binding.adapter = myAdapter
        binding.reservoirVM = this
    }

    fun toNextPage(view: View) {
        var intent = Intent(context, PerformPlaceActivity::class.java)
        context.startActivity(intent)
    }
}