package com.sanjoo.mvvm_domain.repo_interface

import com.sanjoo.mvvm_data.models.CuisineData

interface CuisinesRepo {

    fun getAllCuisines(): List<CuisineData>

}