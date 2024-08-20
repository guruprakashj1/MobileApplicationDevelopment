package com.example.explicitintentexample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editTextMessage: EditText = findViewById(R.id.editTextMessage)
        val buttonNavigate: Button = findViewById(R.id.buttonNavigate)

        buttonNavigate.setOnClickListener {
            val message = editTextMessage.text.toString()
            val intent = Intent(this, SecondActivity::class.java).apply {
                putExtra("MESSAGE_KEY", message)
            }
            startActivity(intent)
        }
    }
}
