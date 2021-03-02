package com.example.ad_t3.dbmodel

import com.example.ad_t3.R

fun getDiceList (): List<Photo>{
    return listOf(
        Photo("DICE_1", R.drawable.dice_1),
        Photo("DICE_2", R.drawable.dice_2),
        Photo("DICE_3", R.drawable.dice_3),
        Photo("DICE_4", R.drawable.dice_4),
        Photo("DICE_5", R.drawable.dice_5),
        Photo("DICE_6", R.drawable.dice_6)
        )
}