package com.example.sharedpreferencesreader

import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var tvSharedData: TextView
    private lateinit var btnRefresh: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvSharedData = findViewById(R.id.tvSharedData)
        btnRefresh = findViewById(R.id.btnRefresh)

        loadSharedPreferences()

        btnRefresh.setOnClickListener {
            loadSharedPreferences()
        }
    }

    private fun loadSharedPreferences() {
        try {
            val uri = Uri.parse("content://com.example.sharedpreferencesexample.provider")
            val cursor = contentResolver.query(uri, null, null, null, null)

            cursor?.use {
                val data = mutableMapOf<String, String>()
                while (it.moveToNext()) {
                    val key = it.getString(it.getColumnIndexOrThrow("key"))
                    val value = it.getString(it.getColumnIndexOrThrow("value"))
                    data[key] = value
                }

                val username = data["username"] ?: "Not set"
                val darkMode = data["darkMode"]?.toBoolean() ?: false

                tvSharedData.text = "Shared Preferences from other app:\n\n" +
                        "Username: $username\n" +
                        "Dark Mode: $darkMode"
            }
        } catch (e: Exception) {
            tvSharedData.text = "Error: Unable to access shared preferences from other app.\n" +
                    "Make sure the other app is installed and has run at least once.\n" +
                    "Error: ${e.message}"
        }
    }
}
