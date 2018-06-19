package com.jwisdom.tainanreservoir.reservoir

import android.databinding.DataBindingUtil
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.jwisdom.tainanreservoir.R
import com.jwisdom.tainanreservoir.databinding.ActivityReservoirItemBinding

class MyAdapter: RecyclerView.Adapter<MyAdapter.ViewHolder> {
    private var list: List<Reservoir>

    constructor(list: List<Reservoir>) {
        this.list = list
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var binding = DataBindingUtil.inflate<ActivityReservoirItemBinding>(LayoutInflater.from(parent.context),
                                                                            R.layout.activity_reservoir_item,
                                                                            parent,
                                                                            false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binding.reservoir = list.get(position)
    }

    class ViewHolder: RecyclerView.ViewHolder {
        var binding: ActivityReservoirItemBinding
            get() = field
            set(value) { field = value }

        constructor(binding: ActivityReservoirItemBinding): super(binding.root) {
            this.binding = binding
        }

    }
}