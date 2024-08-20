package com.example.internalintentexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val textViewProfile = findViewById<TextView>(R.id.textViewProfile)
        val buttonBack = findViewById<Button>(R.id.buttonBack)

        val name = intent.getStringExtra("NAME") ?: "Unknown"
        val age = intent.getIntExtra("AGE", 0)

        textViewProfile.text = "Name: $name\nAge: $age"

        buttonBack.setOnClickListener {
            finish()
        }
    }
}
