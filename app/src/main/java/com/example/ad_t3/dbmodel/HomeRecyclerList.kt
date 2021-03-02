package com.example.ad_t3.dbmodel

import androidx.databinding.ViewDataBinding
import com.example.ad_t3.ui.home.BannerItem
import com.example.ad_t3.ui.home.HomeAdapterItem
import com.example.ad_t3.ui.home.TitleItem
import com.example.ad_t3.ui.home.viewpageradapter.HomeViewPagerItem
import com.xwray.groupie.databinding.BindableItem

fun getHomeRecyclerList(): List<BindableItem<out ViewDataBinding>> {
    return listOf(
        TitleItem(Title("VIEWPAGER2")),
        HomeViewPagerItem(getMotorcycleList()),
        TitleItem(Title("BEST MOBILES IN WORLD")),
        HomeAdapterItem(getMobileList()),
        BannerItem(Discount("تخفیف ویژه")),
        TitleItem(Title("TEST YOUR CHANCE BY CHOOSING DICE")),
        HomeAdapterItem(getDiceList()),
        TitleItem(Title("CHOOSE FRESH FLOWERS HERE")),
        HomeAdapterItem(getFlowerList()),
        BannerItem(Discount("تخفیف ویژه")),




    )
}