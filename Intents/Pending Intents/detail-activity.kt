package com.example.pendingintentexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val textView = findViewById<TextView>(R.id.textViewDetail)
        textView.text = "This is the Detail Activity opened from the notification."
    }
}
