package com.sanjoo.mvvm_presentation

import SingletonObjectsProvider
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.lifecycleScope
import com.sanjoo.mvvm_domain.GetAllCuisineUseCase
import com.sanjoo.mvvm_presentation.databinding.ActivityHelloWorldBinding
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class HelloWorldActivity:AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding:ActivityHelloWorldBinding=DataBindingUtil.setContentView(this,R.layout.activity_hello_world)

        val getAllCuisineUseCase=GetAllCuisineUseCase(SingletonObjectsProvider.cuisineRepoImpl)

        lifecycleScope.launch(Dispatchers.Main) {

            Log.d("cuisineDataLog", "${getAllCuisineUseCase.execute()}")

            binding.text.text=getAllCuisineUseCase.execute().toString()
        }
    }
}