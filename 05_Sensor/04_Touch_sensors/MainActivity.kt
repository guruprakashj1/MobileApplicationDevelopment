package com.example.touch

import android.graphics.Color
import android.os.Bundle
import android.view.MotionEvent
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity(), View.OnTouchListener {

    private lateinit var touchStatusTextView: TextView
    private lateinit var touchCoordinatesTextView: TextView
    private lateinit var rootLayout: ConstraintLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        touchStatusTextView = findViewById(R.id.touchStatusTextView)
        touchCoordinatesTextView = findViewById(R.id.touchCoordinatesTextView)
        rootLayout = findViewById(R.id.rootLayout)

        // Set the OnTouchListener for the entire activity
        findViewById<View>(android.R.id.content).setOnTouchListener(this)
    }

    override fun onTouch(v: View?, event: MotionEvent?): Boolean {
        event?.let {
            val x = it.x
            val y = it.y

            when (it.action) {
                MotionEvent.ACTION_DOWN -> {
                    touchStatusTextView.text = "Touch detected"
                    updateCoordinates(x, y)
                    rootLayout.setBackgroundColor(Color.RED)
                }
                MotionEvent.ACTION_MOVE -> {
                    touchStatusTextView.text = "Touch moved"
                    updateCoordinates(x, y)
                }
                MotionEvent.ACTION_UP -> {
                    touchStatusTextView.text = "Touch released"
                    touchCoordinatesTextView.text = "No touch detected"
                    rootLayout.setBackgroundColor(Color.WHITE)
                }
            }
        }
        return true
    }

    private fun updateCoordinates(x: Float, y: Float) {
        touchCoordinatesTextView.text = "X: $x, Y: $y"
    }
}