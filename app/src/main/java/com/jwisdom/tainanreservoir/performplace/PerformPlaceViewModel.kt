package com.jwisdom.tainanreservoir.performplace

import android.arch.lifecycle.ViewModel
import android.content.Context
import com.jwisdom.tainanreservoir.databinding.ActivityPerformPlaceBinding

class PerformPlaceViewModel: ViewModel {
    private var context: Context
    private var binding: ActivityPerformPlaceBinding

    constructor(context: Context, binding: ActivityPerformPlaceBinding) {
        this.context = context
        this.binding = binding
        initAdapter()
    }

    private fun initAdapter() {
        var adapter = PerformPlaceAdapter(PerformPlace().getData()!!)
        binding.adapter = adapter


    }
}