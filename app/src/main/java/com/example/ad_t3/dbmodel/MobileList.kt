package com.example.ad_t3.dbmodel

import com.example.ad_t3.R

fun getMobileList (): List<Photo>{
    return listOf(
        Photo("MOBILE_1", R.drawable.mobile1),
        Photo("MOBILE_2", R.drawable.mobile2),
        Photo("MOBILE_3", R.drawable.mobile3),
        Photo("MOBILE_4", R.drawable.mobile5),
        Photo("MOBILE_5", R.drawable.mobile6)
    )
}