package com.example.ad_t3.ui.home

import com.example.ad_t3.R
import com.example.ad_t3.databinding.HomeRecyclerItemBinding
import com.example.ad_t3.dbmodel.Photo
import com.example.ad_t3.dbmodel.Title
import com.example.ad_t3.dbmodel.getFlowerList
import com.xwray.groupie.GroupieAdapter
import com.xwray.groupie.databinding.BindableItem

class HomeAdapterItem (val list: List<Photo>):BindableItem<HomeRecyclerItemBinding>(){
    override fun bind(viewBinding: HomeRecyclerItemBinding, position: Int) {
        val list = list
        val listItem = list.map {
            HomeAdapterItem2(it)
        }
        val adapter = GroupieAdapter()
        adapter.addAll(listItem)
        viewBinding.rcHomeItem.adapter = adapter
        viewBinding.executePendingBindings()
    }

    override fun getLayout(): Int {
        return R.layout.home_recycler_item
    }
}