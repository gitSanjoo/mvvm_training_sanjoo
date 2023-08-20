package com.sanjoo.mvvm_data.retrofit

import com.sanjoo.mvvm_data.models.CuisineData
import retrofit2.http.GET

interface ApiService {

    @GET("/cuisines")
    suspend fun getAllCuisines(): List<CuisineData>

}