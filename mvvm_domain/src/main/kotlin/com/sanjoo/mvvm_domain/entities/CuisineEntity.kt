package com.sanjoo.mvvm_domain.entities


data class CuisineEntity(

    var cuisineName: String? = null,

    var cuisineImageUrl: String? = null,

    var dishes: ArrayList<DishEntity> = arrayListOf()

)
