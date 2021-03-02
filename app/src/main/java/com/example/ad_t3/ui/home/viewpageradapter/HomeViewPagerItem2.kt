package com.example.ad_t3.ui.home.viewpageradapter

import com.example.ad_t3.R
import com.example.ad_t3.databinding.HomeViewpagerItem2Binding
import com.example.ad_t3.dbmodel.Photo2
import com.xwray.groupie.databinding.BindableItem

class HomeViewPagerItem2(val photo: Photo2):BindableItem<HomeViewpagerItem2Binding>() {
    override fun bind(viewBinding: HomeViewpagerItem2Binding, position: Int) {
        viewBinding.photo=photo
        viewBinding.executePendingBindings()
    }

    override fun getLayout(): Int {
        return R.layout.home_viewpager_item2
    }
}