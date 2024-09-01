package com.example.slidercolorexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.SeekBar
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {
    private lateinit var layout: ConstraintLayout
    private lateinit var redSeekBar: SeekBar
    private lateinit var greenSeekBar: SeekBar
    private lateinit var blueSeekBar: SeekBar
    private lateinit var colorValueTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize views
        layout = findViewById(R.id.mainLayout)
        redSeekBar = findViewById(R.id.redSeekBar)
        greenSeekBar = findViewById(R.id.greenSeekBar)
        blueSeekBar = findViewById(R.id.blueSeekBar)
        colorValueTextView = findViewById(R.id.colorValueTextView)

        // Set up listeners for each SeekBar
        val listener = object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                updateBackgroundColor()
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {}
            override fun onStopTrackingTouch(seekBar: SeekBar?) {}
        }

        redSeekBar.setOnSeekBarChangeListener(listener)
        greenSeekBar.setOnSeekBarChangeListener(listener)
        blueSeekBar.setOnSeekBarChangeListener(listener)

        // Initialize the background color
        updateBackgroundColor()
    }

    private fun updateBackgroundColor() {
        // Get the current values of each SeekBar
        val red = redSeekBar.progress
        val green = greenSeekBar.progress
        val blue = blueSeekBar.progress

        // Create a color int from RGB values
        val color = android.graphics.Color.rgb(red, green, blue)

        // Set the background color of the layout
        layout.setBackgroundColor(color)

        // Update the text view with the current color values
        val hexColor = String.format("#%02X%02X%02X", red, green, blue)
        colorValueTextView.text = getString(R.string.color_value, hexColor)
    }
}