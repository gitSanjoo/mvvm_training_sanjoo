package com.sanjoo.mvvm_domain.entities


data class RestaurantInfoEntity(
    var hotelName: String? = null,

    var hotelAddress: String? = null,

    var hotelImageUrl: String? = null,

    var cuisines: ArrayList<CuisineEntity> = arrayListOf()

)