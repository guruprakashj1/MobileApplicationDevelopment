package com.example.imageviewdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Find the ImageView in the layout
        val imageView: ImageView = findViewById(R.id.imageView)

        // Set the image resource programmatically
        imageView.setImageResource(R.drawable.sample_image)
    }
}
