package com.example.internalstorageexample

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import java.io.IOException

class MainActivity : AppCompatActivity() {

    private lateinit var etInput: EditText
    private lateinit var btnSave: Button
    private lateinit var btnRead: Button
    private lateinit var tvContent: TextView

    private val fileName = "myInternalFile.txt"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etInput = findViewById(R.id.etInput)
        btnSave = findViewById(R.id.btnSave)
        btnRead = findViewById(R.id.btnRead)
        tvContent = findViewById(R.id.tvContent)

        btnSave.setOnClickListener {
            val text = etInput.text.toString()
            writeToInternalStorage(text)
        }

        btnRead.setOnClickListener {
            tvContent.text = readFromInternalStorage()
        }
    }

    private fun writeToInternalStorage(text: String) {
        try {
            openFileOutput(fileName, Context.MODE_PRIVATE).use { outputStream ->
                outputStream.write(text.toByteArray())
            }
            Toast.makeText(this, "Saved to Internal Storage", Toast.LENGTH_SHORT).show()
            etInput.text.clear()
        } catch (e: IOException) {
            e.printStackTrace()
            Toast.makeText(this, "Error saving file", Toast.LENGTH_SHORT).show()
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