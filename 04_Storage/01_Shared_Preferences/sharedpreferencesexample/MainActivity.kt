package com.example.sharedpreferencesexample

import android.content.Context
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Switch
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var etUsername: EditText
    private lateinit var switchDarkMode: Switch
    private lateinit var btnSave: Button
    private lateinit var tvSavedData: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etUsername = findViewById(R.id.etUsername)
        switchDarkMode = findViewById(R.id.switchDarkMode)
        btnSave = findViewById(R.id.btnSave)
        tvSavedData = findViewById(R.id.tvSavedData)

        // Load saved preferences
        loadPreferences()

        btnSave.setOnClickListener {
            savePreferences()
            loadPreferences() // Reload to display saved data
        }
    }

    private fun savePreferences() {
        val sharedPref = getSharedPreferences("MyPrefs", Context.MODE_PRIVATE)
        with(sharedPref.edit()) {
            putString("username", etUsername.text.toString())
            putBoolean("darkMode", switchDarkMode.isChecked)
            apply()
        }
    }

    private fun loadPreferences() {
        val sharedPref = getSharedPreferences("MyPrefs", Context.MODE_PRIVATE)
        val username = sharedPref.getString("username", "")
        val darkMode = sharedPref.getBoolean("darkMode", false)

        etUsername.setText(username)
        switchDarkMode.isChecked = darkMode

        tvSavedData.text = "Saved Username: $username\nDark Mode: $darkMode"
    }
}
