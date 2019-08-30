package com.example.helloworld1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.Observable
import androidx.databinding.ObservableField
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val viewModel = ViewModelProviders.of(this).get(HelloWorldViewModel::class.java)
        val binding = DataBindingUtil.setContentView<com.example.helloworld1.databinding.ActivityMainBinding>(
            this,
            R.layout.activity_main
        )
        binding.viewModel = viewModel
    }
}


class HelloWorldViewModel : ViewModel() {
    val greetingText = ObservableField<String>("")
    val inputText = ObservableField<String>("")

    fun onGreetActionClicked() {
        greetingText.set("Hello ${inputText.get()}")
    }

    fun onGoodByeActionClicked() {
        greetingText.set("Good bye ${inputText.get()}")
    }
}


