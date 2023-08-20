package com.sanjoo.mvvm_presentation

import SingletonObjectsProvider
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.sanjoo.mvvm_domain.GetAllCuisineUseCase
import com.sanjoo.mvvm_presentation.databinding.ActivityHelloWorldBinding
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class HelloWorldActivity:AppCompatActivity() {

    private lateinit var binding: ActivityHelloWorldBinding
    private lateinit var helloWorldViewModel:HelloWorldViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        helloWorldViewModel=ViewModelProvider(this).get(HelloWorldViewModel::class.java)
        binding=DataBindingUtil.setContentView(this,R.layout.activity_hello_world)
        initCollectors()
        helloWorldViewModel.getAllCuisines()

    }

    private fun initCollectors(){
        lifecycleScope.launch {
            helloWorldViewModel.allCuisines.collect {
                Log.d("cuisineDataLog", "$it")
                binding.text.text=it.toString()
            }
        }
    }
}