package com.example.progressbardemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ProgressBar
import android.os.Handler
import android.os.Looper

class MainActivity : AppCompatActivity() {

    private lateinit var determinateProgressBar: ProgressBar
    private lateinit var startButton: Button
    private val handler = Handler(Looper.getMainLooper())
    private var progressStatus = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        determinateProgressBar = findViewById(R.id.determinateProgressBar)
        startButton = findViewById(R.id.startButton)

        startButton.setOnClickListener {
            progressStatus = 0
            simulateProgress()
        }
    }

    private fun simulateProgress() {
        Thread {
            while (progressStatus < 100) {
                progressStatus += 1
                handler.post {
                    determinateProgressBar.progress = progressStatus
                }
                Thread.sleep(50) // Simulate some work being done
            }
        }.start()
    }
}
