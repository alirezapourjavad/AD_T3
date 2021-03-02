package com.example.ad_t3.ui.home

import com.example.ad_t3.R
import com.example.ad_t3.databinding.HomeTitleRecyclerBinding
import com.example.ad_t3.dbmodel.Title
import com.xwray.groupie.databinding.BindableItem

class TitleItem(val title:Title):BindableItem<HomeTitleRecyclerBinding>() {
    override fun bind(viewBinding: HomeTitleRecyclerBinding, position: Int) {
        viewBinding.title=title
        viewBinding.executePendingBindings()
    }

    override fun getLayout(): Int {
        return R.layout.home_title_recycler
    }
}