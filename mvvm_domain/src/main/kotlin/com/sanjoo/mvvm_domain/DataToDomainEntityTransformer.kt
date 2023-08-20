package com.sanjoo.mvvm_domain

import com.sanjoo.mvvm_data.models.CuisineData
import com.sanjoo.mvvm_data.models.DishData
import com.sanjoo.mvvm_domain.entities.CuisineEntity
import com.sanjoo.mvvm_domain.entities.DishEntity
import java.util.ArrayList

object DataToDomainEntityTransformer {

    fun DishData.toDomain(): DishEntity {
        return DishEntity(dishName = dishName, dishImageUrl = dishImageUrl, price = price, dishType = dishType, mealType = mealType, rating = rating)
    }

    fun CuisineData.toDomain(): CuisineEntity {

        val dishesList=ArrayList<DishEntity>()

        dishes.forEach {
            dishesList.add(it.toDomain())
        }

        return CuisineEntity(cuisineName = cuisineName,cuisineImageUrl=cuisineImageUrl, dishes = dishesList)
    }

}