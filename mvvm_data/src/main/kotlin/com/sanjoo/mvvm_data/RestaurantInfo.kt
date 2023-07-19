package com.sanjoo.mvvm_data

import com.google.gson.annotations.SerializedName

data class RestaurantInfo (
    @SerializedName("hotelName"     ) var hotelName     : String?             = null,
    @SerializedName("hotelAddress"  ) var hotelAddress  : String?             = null,
    @SerializedName("hotelImageUrl" ) var hotelImageUrl : String?             = null,
    @SerializedName("cuisines"      ) var cuisines      : ArrayList<Cuisines> = arrayListOf()

)