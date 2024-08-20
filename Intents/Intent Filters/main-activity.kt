package com.example.intentfilterexample

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textViewContent = findViewById<TextView>(R.id.textViewContent)

        when {
            intent?.action == Intent.ACTION_SEND -> {
                if (intent.type?.startsWith("text/") == true) {
                    handleSendText(intent)
                } else if (intent.type?.startsWith("image/") == true) {
                    handleSendImage(intent)
                }
            }
            else -> {
                textViewContent.text = "Welcome to Intent Filter Example App"
            }
        }
    }

    private fun handleSendText(intent: Intent) {
        intent.getStringExtra(Intent.EXTRA_TEXT)?.let {
            val textViewContent = findViewById<TextView>(R.id.textViewContent)
            textViewContent.text = "Received Text:\n$it"
        }
    }

    private fun handleSendImage(intent: Intent) {
        (intent.getParcelableExtra<Uri>(Intent.EXTRA_STREAM))?.let {
            val textViewContent = findViewById<TextView>(R.id.textViewContent)
            textViewContent.text = "Received Image URI:\n$it"
        }
    }
}
