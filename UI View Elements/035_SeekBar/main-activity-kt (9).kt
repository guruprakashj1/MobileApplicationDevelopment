package com.example.seekbardemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.SeekBar
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var seekBar: SeekBar
    private lateinit var progressText: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        seekBar = findViewById(R.id.seekBar)
        progressText = findViewById(R.id.progressText)

        updateProgressText(seekBar.progress)

        seekBar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                updateProgressText(progress)
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {
                // This method is called when the user first touches the SeekBar
            }

            override fun onStopTrackingTouch(seekBar: SeekBar?) {
                // This method is called when the user stops touching the SeekBar
            }
        })
    }

    private fun updateProgressText(progress: Int) {
        progressText.text = "Progress: $progress"
    }
}
