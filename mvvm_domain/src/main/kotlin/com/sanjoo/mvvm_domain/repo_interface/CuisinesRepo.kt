package com.sanjoo.mvvm_domain.repo_interface

import com.sanjoo.mvvm_data.models.CuisineData
import com.sanjoo.mvvm_domain.entities.CuisineEntity

interface CuisinesRepo {

    fun getAllCuisines(): List<CuisineEntity>

}