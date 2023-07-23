package com.sanjoo.mvvm_presentation

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.sanjoo.mvvm_presentation.databinding.ActivityHelloWorldBinding
import mvvm_common.repository_impl.CuisineRepoImpl

class HelloWorldActivity:AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding:ActivityHelloWorldBinding=DataBindingUtil.setContentView(this,R.layout.activity_hello_world)

        val cuisineRepoImpl=CuisineRepoImpl()

        //Log.d("cuisineDataLog",cuisineRepoImpl.getAllCuisines().toString())
        Log.d("cuisineDataLog","${cuisineRepoImpl.getAllCuisines()}")
    }
}