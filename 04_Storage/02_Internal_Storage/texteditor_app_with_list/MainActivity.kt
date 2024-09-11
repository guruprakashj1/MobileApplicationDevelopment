package com.example.internalstorageexample

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AlertDialog
import java.io.IOException

class MainActivity : AppCompatActivity() {

    private lateinit var etContent: EditText
    private lateinit var etFileName: EditText
    private lateinit var btnSave: Button
    private lateinit var lvFiles: ListView
    private lateinit var fileAdapter: ArrayAdapter<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etContent = findViewById(R.id.etContent)
        etFileName = findViewById(R.id.etFileName)
        btnSave = findViewById(R.id.btnSave)
        lvFiles = findViewById(R.id.lvFiles)

        fileAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, mutableListOf())
        lvFiles.adapter = fileAdapter

        updateFileList()

        btnSave.setOnClickListener {
            val content = etContent.text.toString()
            val fileName = etFileName.text.toString()
            if (content.isNotEmpty() && fileName.isNotEmpty()) {
                saveFile(content, fileName)
                updateFileList()
                etContent.text.clear()
                etFileName.text.clear()
            } else {
                Toast.makeText(this, "Please enter both content and file name", Toast.LENGTH_SHORT).show()
            }
        }

        lvFiles.setOnItemClickListener { _, _, position, _ ->
            val fileName = fileAdapter.getItem(position)
            fileName?.let { showFileContent(it) }
        }
    }

    private fun saveFile(content: String, fileName: String) {
        try {
            val fileNameWithExtension = "$fileName.txt"
            openFileOutput(fileNameWithExtension, Context.MODE_PRIVATE).use {
                it.write(content.toByteArray())
            }
            Toast.makeText(this, "Saved to $fileNameWithExtension", Toast.LENGTH_SHORT).show()
        } catch (e: IOException) {
            Toast.makeText(this, "Error saving file", Toast.LENGTH_SHORT).show()
        }
    }

    private fun updateFileList() {
        val files = fileList().filter { it.endsWith(".txt") }
        fileAdapter.clear()
        fileAdapter.addAll(files)
    }

    private fun showFileContent(fileName: String) {
        try {
            val content = openFileInput(fileName).bufferedReader().use { it.readText() }
            AlertDialog.Builder(this)
                .setTitle(fileName)
                .setMessage(content)
                .setPositiveButton("OK", null)
                .show()
        } catch (e: IOException) {
            Toast.makeText(this, "Error reading file", Toast.LENGTH_SHORT).show()
        }
    }
}