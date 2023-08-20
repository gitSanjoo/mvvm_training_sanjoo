package com.sanjoo.mvvm_presentation

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.viewModelScope
import com.sanjoo.mvvm_domain.GetAllCuisineUseCase
import com.sanjoo.mvvm_domain.entities.CuisineEntity
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import java.util.ArrayList

class HelloWorldViewModel : ViewModel() {

    private val _allCuisines=MutableStateFlow<List<CuisineEntity>>(ArrayList())
    val allCuisines: StateFlow<List<CuisineEntity>> get() = _allCuisines

    fun getAllCuisinesFromApi(){
        val getAllCuisineUseCase= GetAllCuisineUseCase(SingletonObjectsProvider.cuisineRepoImpl)

        viewModelScope.launch(Dispatchers.IO) {
            _allCuisines.value=getAllCuisineUseCase.execute()
        }
    }

}