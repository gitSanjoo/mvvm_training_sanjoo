package com.sanjoo.mvvm_data.retrofit

import retrofit2.Retrofit

class ApiServiceClass {

    fun getApiService(retrofitBuilder: Retrofit.Builder): ApiService {
        return retrofitBuilder
            .baseUrl("http://192.168.1.3:3000/")
            .build()
            .create(ApiService::class.java)
    }

}