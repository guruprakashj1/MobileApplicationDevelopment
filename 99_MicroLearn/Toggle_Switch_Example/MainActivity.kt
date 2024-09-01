package com.example.toggleswitchexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Switch
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var toggleSwitch: Switch

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize the toggle switch
        toggleSwitch = findViewById(R.id.toggleSwitch)

        // Set a listener for switch state changes
        toggleSwitch.setOnCheckedChangeListener { _, isChecked ->
            // Determine the message based on the switch state
            val message = if (isChecked) {
                getString(R.string.switch_on_message)
            } else {
                getString(R.string.switch_off_message)
            }

            // Show a toast message
            showToast(message)
        }
    }

    // Function to show a toast message
    private fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}