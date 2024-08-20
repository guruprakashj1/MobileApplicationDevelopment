package com.example.ratingbardemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RatingBar
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var ratingBar: RatingBar
    private lateinit var ratingDisplay: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ratingBar = findViewById(R.id.ratingBar)
        ratingDisplay = findViewById(R.id.ratingDisplay)

        ratingBar.setOnRatingBarChangeListener { _, rating, _ ->
            ratingDisplay.text = "Rating: $rating"
        }
    }
}
