package com.example.ad_t3.ui.home.viewpageradapter

import com.example.ad_t3.R
import com.example.ad_t3.databinding.HomeViewpagerItemBinding
import com.example.ad_t3.dbmodel.Photo2
import com.xwray.groupie.GroupieAdapter
import com.xwray.groupie.databinding.BindableItem

class HomeViewPagerItem(val list:List<Photo2>):BindableItem<HomeViewpagerItemBinding>() {
    override fun bind(viewBinding: HomeViewpagerItemBinding, position: Int) {
        val listItem = list.map {
            HomeViewPagerItem2(it)
        }
        val adapter = GroupieAdapter()
        adapter.addAll(listItem)
        viewBinding.viewPager.adapter = adapter
        viewBinding.executePendingBindings()
    }

    override fun getLayout(): Int {
        return R.layout.home_viewpager_item
    }
}