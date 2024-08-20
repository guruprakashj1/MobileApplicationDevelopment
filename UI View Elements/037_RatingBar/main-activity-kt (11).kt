package com.example.ratingbardemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RatingBar
import android.widget.TextView
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private lateinit var ratingBar: RatingBar
    private lateinit var ratingText: TextView
    private lateinit var submitButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ratingBar = findViewById(R.id.ratingBar)
        ratingText = findViewById(R.id.ratingText)
        submitButton = findViewById(R.id.submitButton)

        updateRatingText(ratingBar.rating)

        ratingBar.setOnRatingBarChangeListener { _, rating, fromUser ->
            updateRatingText(rating)
        }

        submitButton.setOnClickListener {
            // Here you would typically send the rating to a server or save it locally
            val message = "Rating of ${ratingBar.rating} stars submitted!"
            ratingText.text = message
        }
    }

    private fun updateRatingText(rating: Float) {
        ratingText.text = "Your rating: $rating stars"
    }
}
