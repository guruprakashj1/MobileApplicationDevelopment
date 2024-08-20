package com.example.discreteseekbardemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.SeekBar
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var seekBar: SeekBar
    private lateinit var valueText: TextView
    private val values = arrayOf(0, 2, 5, 10, 20, 50, 100, 200, 500, 1000)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        seekBar = findViewById(R.id.discreteSeekBar)
        valueText = findViewById(R.id.valueText)

        seekBar.max = values.size - 1
        updateValueText(seekBar.progress)

        seekBar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                updateValueText(progress)
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {}

            override fun onStopTrackingTouch(seekBar: SeekBar?) {}
        })
    }

    private fun updateValueText(progress: Int) {
        valueText.text = "Selected Value: ${values[progress]}"
    }
}
