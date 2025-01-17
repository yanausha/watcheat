package com.example.composeApp.features.foodstuff.domain

import com.example.composeApp.enums.ProductUnit
import com.example.syncApi.FoodstuffSyncEntity

data class FoodstuffItem(
    val id: Long,
    val name: String = "",
    val count: Int = 0,
    val unit: ProductUnit = ProductUnit.PIECE,
    val insertDate: Long
) {
    fun toSyncEntity() = FoodstuffSyncEntity(
        id = id,
        name = name,
        count = count,
        unit = unit,
        insertDate = insertDate
    )
}

fun FoodstuffSyncEntity.toItem() = FoodstuffItem(
    id = id,
    name = name,
    count = count,
    unit = unit,
    insertDate = insertDate
)