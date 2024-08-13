package com.example.switchexample

import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.SwitchCompat

class MainActivity : AppCompatActivity() {

    private lateinit var controlledTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        controlledTextView = findViewById(R.id.controlledTextView)

        setupBasicSwitch()
        setupCustomTextSwitch()
        setupCustomColorSwitch()
        setupDisabledSwitch()
        setupCustomThumbTrackSwitch()
        createProgrammaticSwitch()
        setupControlSwitch()
    }

    private fun setupBasicSwitch() {
        val basicSwitch: SwitchCompat = findViewById(R.id.basicSwitch)
        basicSwitch.setOnCheckedChangeListener { _, isChecked ->
            showToast("Basic Switch is ${if (isChecked) "ON" else "OFF"}")
        }
    }

    private fun setupCustomTextSwitch() {
        val customTextSwitch: SwitchCompat = findViewById(R.id.customTextSwitch)
        customTextSwitch.setOnCheckedChangeListener { _, isChecked ->
            showToast("Custom Text Switch is ${if (isChecked) "ON" else "OFF"}")
        }
    }

    private fun setupCustomColorSwitch() {
        val customColorSwitch: SwitchCompat = findViewById(R.id.customColorSwitch)
        customColorSwitch.setOnCheckedChangeListener { _, isChecked ->
            showToast("Custom Color Switch is ${if (isChecked) "ON" else "OFF"}")
        }
    }

    private fun setupDisabledSwitch() {
        val disabledSwitch: SwitchCompat = findViewById(R.id.disabledSwitch)
        disabledSwitch.isEnabled = false
    }

    private fun setupCustomThumbTrackSwitch() {
        val customThumbTrackSwitch: SwitchCompat = findViewById(R.id.customThumbTrackSwitch)
        customThumbTrackSwitch.setOnCheckedChangeListener { _, isChecked ->
            showToast("Custom Thumb/Track Switch is ${if (isChecked) "ON" else "OFF"}")
        }
    }

    private fun createProgrammaticSwitch() {
        val containerLayout: LinearLayout = findViewById(R.id.switchContainer)
        
        val programmaticSwitch = SwitchCompat(this).apply {
            text = "Programmatic Switch"
            isChecked = true
        }
        
        programmaticSwitch.setOnCheckedChangeListener { _, isChecked ->
            showToast("Programmatic Switch is ${if (isChecked) "ON" else "OFF"}")
        }

        containerLayout.addView(programmaticSwitch)
    }

    private fun setupControlSwitch() {
        val controlSwitch: SwitchCompat = findViewById(R.id.controlSwitch)
        controlSwitch.setOnCheckedChangeListener { _, isChecked ->
            controlledTextView.visibility = if (isChecked) View.VISIBLE else View.GONE
        }
    }

    private fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}
