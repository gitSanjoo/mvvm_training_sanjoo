package com.sanjoo.mvvm_data.retrofit

import retrofit2.Retrofit

class ApiServiceClass {

    fun getApiService(retrofitBuilder: Retrofit.Builder): ApiService {
        return retrofitBuilder
            .baseUrl("base_url_will_be_passed_here")
            .build()
            .create(ApiService::class.java)
    }

}