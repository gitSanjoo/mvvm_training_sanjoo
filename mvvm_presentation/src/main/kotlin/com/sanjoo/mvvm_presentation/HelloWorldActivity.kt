package com.sanjoo.mvvm_presentation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.sanjoo.mvvm_presentation.databinding.ActivityHelloWorldBinding

class HelloWorldActivity:AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding:ActivityHelloWorldBinding=DataBindingUtil.setContentView(this,R.layout.activity_hello_world)
        
    }
}