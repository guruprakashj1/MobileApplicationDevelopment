package com.example.horizontalprogressbardemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ProgressBar
import android.os.Handler
import android.os.Looper
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var progressBar: ProgressBar
    private lateinit var startButton: Button
    private lateinit var pauseButton: Button
    private lateinit var resetButton: Button
    private lateinit var progressText: TextView
    private val handler = Handler(Looper.getMainLooper())
    private var progressStatus = 0
    private var isProgressRunning = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        progressBar = findViewById(R.id.horizontalProgressBar)
        startButton = findViewById(R.id.startButton)
        pauseButton = findViewById(R.id.pauseButton)
        resetButton = findViewById(R.id.resetButton)
        progressText = findViewById(R.id.progressText)

        startButton.setOnClickListener {
            if (!isProgressRunning) {
                isProgressRunning = true
                simulateProgress()
            }
        }

        pauseButton.setOnClickListener {
            isProgressRunning = false
        }

        resetButton.setOnClickListener {
            isProgressRunning = false
            progressStatus = 0
            progressBar.progress = 0
            updateProgressText()
        }
    }

    private fun simulateProgress() {
        Thread {
            while (progressStatus < 100 && isProgressRunning) {
                progressStatus += 1
                handler.post {
                    progressBar.progress = progressStatus
                    updateProgressText()
                }
                Thread.sleep(50) // Simulate some work being done
            }
            isProgressRunning = false
        }.start()
    }

    private fun updateProgressText() {
        progressText.text = "$progressStatus%"
    }
}
