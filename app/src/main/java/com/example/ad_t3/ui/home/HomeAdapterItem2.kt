package com.example.ad_t3.ui.home

import com.example.ad_t3.R
import com.example.ad_t3.databinding.HomeRecyclerItem2Binding
import com.example.ad_t3.dbmodel.Photo
import com.xwray.groupie.databinding.BindableItem

class HomeAdapterItem2(val photo: Photo):BindableItem<HomeRecyclerItem2Binding>() {
    override fun bind(viewBinding: HomeRecyclerItem2Binding, position: Int) {
        viewBinding.photo =photo
        viewBinding.executePendingBindings()
    }

    override fun getLayout(): Int {
        return R.layout.home_recycler_item2
    }
}