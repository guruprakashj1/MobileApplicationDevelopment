package com.example.pendingintentexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ActionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_action)

        val textView = findViewById<TextView>(R.id.textViewAction)
        textView.text = "This is the Action Activity opened from the notification action button."
    }
}
