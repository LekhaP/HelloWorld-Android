package com.example.helloworld1

import android.support.v7.app.AppCompatActivity

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val greetingText : TextView = findViewById(R.id.greetingTextview)
        val inputView = findViewById<EditText>(R.id.inputTextField)
        val actionGreet = findViewById<Button>(R.id.greetButton)
        val actionGoodbye = findViewById<Button>(R.id.GoodByeButton)

        actionGreet.setOnClickListener { btn ->
            greetingText.text = "Hello, ${inputView.text}!"
        }

        actionGoodbye.setOnClickListener { btn ->
            greetingText.text = "Goodbye, ${inputView.text}!"
        }
    }
}
