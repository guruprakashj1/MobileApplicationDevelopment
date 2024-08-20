package com.example.implicitintentexample

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts

class MainActivity : AppCompatActivity() {

    private lateinit var imageView: ImageView

    private val getContent = registerForActivityResult(ActivityResultContracts.GetContent()) { uri: Uri? ->
        uri?.let { imageView.setImageURI(it) }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageView = findViewById(R.id.imageView)

        val buttonOpenWebpage: Button = findViewById(R.id.buttonOpenWebpage)
        val buttonShareText: Button = findViewById(R.id.buttonShareText)
        val buttonPickImage: Button = findViewById(R.id.buttonPickImage)

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
            val shareIntent = Intent().apply {
                action = Intent.ACTION_SEND
                type = "text/plain"
                putExtra(Intent.EXTRA_TEXT, "Check out this cool Implicit Intent example!")
            }
            startActivity(Intent.createChooser(shareIntent, "Share via"))
        }

        buttonPickImage.setOnClickListener {
            getContent.launch("image/*")
        }
    }
}
