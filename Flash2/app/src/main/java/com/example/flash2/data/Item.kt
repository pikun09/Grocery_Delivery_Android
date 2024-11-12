package com.example.flash2.data


import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.flash2.R

data class Item(
    @StringRes val stringResourceId : Int,
    @StringRes val itemCategoryId:Int,
    val itemQuantityId : String,
    val itemPriceId : Int,
    @DrawableRes val imageResourceId : Int
)
