package com.example.externalintentexample

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonOpenWebpage = findViewById<Button>(R.id.buttonOpenWebpage)
        val buttonShareText = findViewById<Button>(R.id.buttonShareText)
        val buttonSendEmail = findViewById<Button>(R.id.buttonSendEmail)
        val buttonMakeCall = findViewById<Button>(R.id.buttonMakeCall)

        buttonOpenWebpage.setOnClickListener {
            val webpage: Uri = Uri.parse("https://www.example.com")
            val intent = Intent(Intent.ACTION_VIEW, webpage)
            if (intent.resolveActivity(packageManager) != null) {
                startActivity(intent)
            } else {
                Toast.makeText(this, "No web browser available", Toast.LENGTH_SHORT).show()
            }
        }

        buttonShareText.setOnClickListener {
            val sendIntent: Intent = Intent().apply {
                action = Intent.ACTION_SEND
                putExtra(Intent.EXTRA_TEXT, "This is my text to send.")
                type = "text/plain"
            }
            val shareIntent = Intent.createChooser(sendIntent, null)
            startActivity(shareIntent)
        }

        buttonSendEmail.setOnClickListener {
            val intent = Intent(Intent.ACTION_SENDTO).apply {
                data = Uri.parse("mailto:")
                putExtra(Intent.EXTRA_EMAIL, arrayOf("example@example.com"))
                putExtra(Intent.EXTRA_SUBJECT, "Email subject")
                putExtra(Intent.EXTRA_TEXT, "Email body")
            }
            if (intent.resolveActivity(packageManager) != null) {
                startActivity(intent)
            } else {
                Toast.makeText(this, "No email app available", Toast.LENGTH_SHORT).show()
            }
        }

        buttonMakeCall.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL).apply {
                data = Uri.parse("tel:1234567890")
            }
            if (intent.resolveActivity(packageManager) != null) {
                startActivity(intent)
            } else {
                Toast.makeText(this, "No phone app available", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
