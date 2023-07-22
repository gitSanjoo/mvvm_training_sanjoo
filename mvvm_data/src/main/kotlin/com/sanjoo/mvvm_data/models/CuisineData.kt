package com.sanjoo.mvvm_data.models

import com.google.gson.annotations.SerializedName

data class CuisineData(

    @SerializedName("cuisineName")
    var cuisineName: String? = null,

    @SerializedName("cuisineImageUrl")
    var cuisineImageUrl: String? = null,

    @SerializedName("dishes")
    var dishes: ArrayList<DishData> = arrayListOf()

)
