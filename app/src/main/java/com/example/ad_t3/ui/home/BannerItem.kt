package com.example.ad_t3.ui.home

import com.example.ad_t3.R
import com.example.ad_t3.databinding.HomeBannerBinding
import com.example.ad_t3.dbmodel.Discount
import com.xwray.groupie.databinding.BindableItem

class BannerItem(val discount:Discount):BindableItem<HomeBannerBinding>() {
    override fun bind(viewBinding: HomeBannerBinding, position: Int) {
        viewBinding.discount = discount
        viewBinding.executePendingBindings()
    }

    override fun getLayout(): Int {
        return R.layout.home_banner
    }
}
