package com.sanjoo.mvvm_data

import Dishes
import com.google.gson.annotations.SerializedName

data class Cuisines (

    @SerializedName("cuisineName"     ) var cuisineName     : String?           = null,
    @SerializedName("cuisineImageUrl" ) var cuisineImageUrl : String?           = null,
    @SerializedName("dishes"          ) var dishes          : ArrayList<Dishes> = arrayListOf()

    )
