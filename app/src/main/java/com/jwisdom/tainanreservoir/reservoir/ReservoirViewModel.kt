package com.jwisdom.tainanreservoir.reservoir

import android.arch.lifecycle.ViewModel
import com.jwisdom.tainanreservoir.databinding.ActivityReservoirBinding

class ReservoirViewModel: ViewModel {

    private var binding: ActivityReservoirBinding

    constructor(binding: ActivityReservoirBinding) {
        this.binding = binding
        initMyAdapter(Reservoir().getData())

    }

    fun initMyAdapter(list: List<Reservoir>) {
        var myAdapter = MyAdapter(list)

        binding.adapter = myAdapter

    }


}