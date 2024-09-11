package com.example.internalstorageexample

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import java.io.IOException

class MainActivity : AppCompatActivity() {

    private lateinit var etContent: EditText
    private lateinit var etFileName: EditText
    private lateinit var btnSave: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etContent = findViewById(R.id.etContent)
        etFileName = findViewById(R.id.etFileName)
        btnSave = findViewById(R.id.btnSave)

        btnSave.setOnClickListener {
            val content = etContent.text.toString()
            val fileName = etFileName.text.toString()
            if (content.isNotEmpty() && fileName.isNotEmpty()) {
                saveToInternalStorage(content, fileName)
            } else {
                Toast.makeText(this, "Please enter both content and file name", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun saveToInternalStorage(content: String, fileName: String) {
        try {
            val fileNameWithExtension = "$fileName.txt"
            openFileOutput(fileNameWithExtension, Context.MODE_PRIVATE).use { outputStream ->
                outputStream.write(content.toByteArray())
            }
            Toast.makeText(this, "Saved to $fileNameWithExtension", Toast.LENGTH_SHORT).show()
            etContent.text.clear()
            etFileName.text.clear()
        } catch (e: IOException) {
            e.printStackTrace()
            Toast.makeText(this, "Error saving file", Toast.LENGTH_SHORT).show()
        }
    }
}
