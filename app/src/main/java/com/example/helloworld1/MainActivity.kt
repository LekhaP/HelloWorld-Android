package com.example.helloworld1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = DataBindingUtil.setContentView<com.example.helloworld1.databinding.ActivityMainBinding>(this, R.layout.activity_main)

        binding.greetButton.setOnClickListener { btn ->
            binding.greetingTextview.text = "Hello, ${binding.inputTextField.text}!"
        }

        binding.GoodByeButton.setOnClickListener { btn ->
            binding.greetingTextview.text = "Goodbye, ${binding.inputTextField.text}!"
        }
    }
}





