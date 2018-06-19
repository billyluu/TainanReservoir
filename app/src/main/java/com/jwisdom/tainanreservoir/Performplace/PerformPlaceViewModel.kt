package com.jwisdom.tainanreservoir.Performplace

import android.arch.lifecycle.ViewModel
import com.jwisdom.tainanreservoir.databinding.ActivityPerformPlaceBinding

class PerformPlaceViewModel constructor(var binding: ActivityPerformPlaceBinding): ViewModel() {

    init {
        initAdapter()
    }

    private fun initAdapter() {
        var adapter = PerformPlaceAdapter(PerformPlace().getData()!!)
        binding.adapter = adapter
    }
}