package com.sanjoo.mvvm_domain

import com.sanjoo.mvvm_domain.entities.CuisineEntity
import com.sanjoo.mvvm_domain.repo_interface.CuisinesRepo

class GetAllCuisineUseCase(val cuisinesRepo: CuisinesRepo) {

    suspend fun execute():List<CuisineEntity>{
        return cuisinesRepo.getAllCuisines()
    }

}