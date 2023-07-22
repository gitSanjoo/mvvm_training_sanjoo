package com.sanjoo.mvvm_domain.entities


data class DishEntity(
    var dishName: String? = null,

    var dishImageUrl: String? = null,

    var price: Int? = null,

    var dishType: String? = null,

    var mealType: String? = null,

    var rating: Int? = null

)
