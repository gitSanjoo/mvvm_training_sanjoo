package com.sanjoo.mvvm_data.models

import com.google.gson.annotations.SerializedName

data class RestaurantInfoData(
    @SerializedName("hotelName")
    var hotelName: String? = null,

    @SerializedName("hotelAddress")
    var hotelAddress: String? = null,

    @SerializedName("hotelImageUrl")
    var hotelImageUrl: String? = null,

    @SerializedName("cuisines")
    var cuisines: ArrayList<CuisineData> = arrayListOf()

)