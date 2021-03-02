package com.example.ad_t3.dbmodel

import com.example.ad_t3.R

fun getMotorcycleList(): List<Photo2> {
    return listOf(
        Photo2("MOTORCYCLE_1","very good", R.drawable.motorcycle_1),
        Photo2("MOTORCYCLE_2","very good", R.drawable.motorcycle_2),
        Photo2("MOTORCYCLE_3","very good", R.drawable.motorcycle_3),
        Photo2("MOTORCYCLE_4","very good", R.drawable.motorcycle_4)
    )
}