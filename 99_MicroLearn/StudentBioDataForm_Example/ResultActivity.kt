package com.example.studentbiodata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ResultActivity : AppCompatActivity() {
    private lateinit var resultTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        resultTextView = findViewById(R.id.resultTextView)

        // Get data from intent
        val name = intent.getStringExtra("NAME") ?: ""
        val age = intent.getStringExtra("AGE") ?: ""
        val gender = intent.getStringExtra("GENDER") ?: ""
        val major = intent.getStringExtra("MAJOR") ?: ""
        val hobbies = intent.getStringArrayListExtra("HOBBIES") ?: arrayListOf()

        // Create result string
        val resultString = """
            Name: $name
            Age: $age
            Gender: $gender
            Major: $major
            Hobbies: ${hobbies.joinToString(", ")}
        """.trimIndent()

        // Set result text
        resultTextView.text = resultString
    }
}