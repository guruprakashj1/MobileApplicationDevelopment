package com.example.internalstorageexample

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import java.io.IOException
import java.text.SimpleDateFormat
import java.util.*

class MainActivity : AppCompatActivity() {

    private lateinit var etInput: EditText
    private lateinit var btnSave: Button
    private lateinit var btnRead: Button
    private lateinit var tvContent: TextView

    private val fileName = "myAppendableFile.txt"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etInput = findViewById(R.id.etInput)
        btnSave = findViewById(R.id.btnSave)
        btnRead = findViewById(R.id.btnRead)
        tvContent = findViewById(R.id.tvContent)

        btnSave.setOnClickListener {
            val text = etInput.text.toString()
            appendToInternalStorage(text)
        }

        btnRead.setOnClickListener {
            tvContent.text = readFromInternalStorage()
        }
    }

    private fun appendToInternalStorage(text: String) {
        try {
            val currentTime = SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault()).format(Date())
            val appendText = "$currentTime: $text\n"

            openFileOutput(fileName, Context.MODE_APPEND).use { outputStream ->
                outputStream.write(appendText.toByteArray())
            }
            Toast.makeText(this, "Appended to Internal Storage", Toast.LENGTH_SHORT).show()
            etInput.text.clear()
        } catch (e: IOException) {
            e.printStackTrace()
            Toast.makeText(this, "Error appending to file", Toast.LENGTH_SHORT).show()
        }
    }

    private fun readFromInternalStorage(): String {
        val stringBuilder = StringBuilder()
        try {
            openFileInput(fileName).use { inputStream ->
                inputStream.bufferedReader().useLines { lines ->
                    lines.forEach {
                        stringBuilder.append(it)
                        stringBuilder.append('\n')
                    }
                }
            }
        } catch (e: IOException) {
            e.printStackTrace()
            Toast.makeText(this, "Error reading file", Toast.LENGTH_SHORT).show()
        }
        return stringBuilder.toString()
    }
}