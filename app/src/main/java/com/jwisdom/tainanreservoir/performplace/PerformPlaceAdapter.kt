package com.jwisdom.tainanreservoir.performplace

import android.databinding.DataBindingUtil
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup

import com.jwisdom.tainanreservoir.R
import com.jwisdom.tainanreservoir.databinding.ItemPerformPlaceGroupBinding

class PerformPlaceAdapter: RecyclerView.Adapter<PerformPlaceAdapter.ViewHodler> {
    private var list: List<PerformPlace>

    constructor(list: List<PerformPlace>) {
        this.list = list
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHodler {
        var binding = DataBindingUtil.inflate<ItemPerformPlaceGroupBinding>(LayoutInflater.from(parent.context),
                                                                            R.layout.item_perform_place_group,
                                                                            parent,
                                                                            false)

        return ViewHodler(binding)
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: ViewHodler, position: Int) {
        holder.binding.performPlace = list.get(position)
    }


    class ViewHodler: RecyclerView.ViewHolder {
        var binding :ItemPerformPlaceGroupBinding
            set(value) { field = value }
            get() = field

        constructor(binding: ItemPerformPlaceGroupBinding): super(binding.root) {
            this.binding = binding
        }
    }
}