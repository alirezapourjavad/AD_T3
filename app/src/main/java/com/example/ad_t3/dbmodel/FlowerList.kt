package com.example.ad_t3.dbmodel

import com.example.ad_t3.R

fun getFlowerList (): List< Photo>{
    return listOf(
        Photo("FLOWER_1", R.drawable.flower1),
        Photo("FLOWER_2", R.drawable.flower2),
        Photo("FLOWER_3", R.drawable.flower3),
        Photo("FLOWER_4", R.drawable.flower4),
        Photo("FLOWER_5", R.drawable.flower5)
    )
}