package com.example.flash2.data

import androidx.annotation.StringRes
import com.example.flash2.R
object DataSource {
    fun loadCategories():List<Categories> {
        return listOf<Categories>(
            Categories(stringResourceId = R.string.fresh_fruits, imageResourceId = R.drawable.fruits),
            Categories(R.string.bath_body,R.drawable.bathbody),
            Categories(R.string.bread_biscuits,R.drawable.bread),
            Categories(R.string.kitchen_essential, R.drawable.kitchen),
            Categories(R.string.munchies,R.drawable.munchies),
            Categories(R.string.packaged_food,R.drawable.packaged_food),
            Categories(R.string.stationery,R.drawable.stationary),
            Categories(R.string.pet_food,R.drawable.pet),
            Categories(R.string.sweet_tooth,R.drawable.sweets),
            Categories(R.string.vegetables,R.drawable.vegetables),
            Categories(R.string.beverages,R.drawable.beverages)
        )
    }
    fun loadItems(
        @StringRes categoryName: Int
    ): List<Item>{
        return listOf(
            Item(R.string.banana_robusta,R.string.fresh_fruits,"1kg",100,R.drawable.banana),
            Item(R.string.shimla_apple,R.string.fresh_fruits,"1kg",250,R.drawable.apple),
            Item(R.string.papaya_semi_ripe,R.string.fresh_fruits,"1kg",150,R.drawable.papaya),
            Item(R.string.pomegranate, R.string.fresh_fruits,"500 g",150,R.drawable.pomegranate),
            Item(R.string.pineapple,R.string.fresh_fruits,"1kg",130,R.drawable.pineapple),
            Item(R.string.pepsi_can,R.string.beverages,"1",40,R.drawable.pepsi)
        ).filter {
            it.itemCategoryId == categoryName
        }
    }
}