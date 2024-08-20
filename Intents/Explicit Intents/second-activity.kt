package com.example.explicitintentexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val textViewMessage: TextView = findViewById(R.id.textViewMessage)
        val message = intent.getStringExtra("MESSAGE_KEY") ?: "No message received"
        textViewMessage.text = message
    }
}
