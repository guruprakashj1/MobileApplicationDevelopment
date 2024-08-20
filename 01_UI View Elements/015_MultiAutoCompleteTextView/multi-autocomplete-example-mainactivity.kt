package com.example.multiautocompleteexample

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.MultiAutoCompleteTextView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var languagesAutoComplete: MultiAutoCompleteTextView
    private lateinit var submitButton: Button
    private lateinit var resultTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize views
        languagesAutoComplete = findViewById(R.id.languagesAutoComplete)
        submitButton = findViewById(R.id.submitButton)
        resultTextView = findViewById(R.id.resultTextView)

        // Set up MultiAutoCompleteTextView
        setupMultiAutoComplete()

        // Set click listener for the submit button
        submitButton.setOnClickListener {
            handleSubmit()
        }
    }

    private fun setupMultiAutoComplete() {
        val languages = resources.getStringArray(R.array.programming_languages_array)
        val adapter = ArrayAdapter(this, android.R.layout.simple_dropdown_item_1line, languages)
        languagesAutoComplete.setAdapter(adapter)

        // Set token separator (comma in this case)
        languagesAutoComplete.setTokenizer(MultiAutoCompleteTextView.CommaTokenizer())

        // Optional: Set threshold for when suggestions should appear (default is 1)
        languagesAutoComplete.threshold = 1
    }

    private fun handleSubmit() {
        val selectedLanguages = languagesAutoComplete.text.toString().trim()
        if (selectedLanguages.isNotEmpty()) {
            val languageList = selectedLanguages.split(",").map { it.trim() }
            val formattedLanguages = languageList.joinToString(", ")
            resultTextView.text = "Selected Languages: $formattedLanguages"
        } else {
            resultTextView.text = "Please select at least one programming language"
        }
    }
}

// Custom Tokenizer for comma-separated input
class TokenizerComma : MultiAutoCompleteTextView.Tokenizer {
    override fun findTokenStart(text: CharSequence, cursor: Int): Int {
        var i = cursor
        while (i > 0 && text[i - 1] != ',') {
            i--
        }
        while (i < cursor && text[i] == ' ') {
            i++
        }
        return i
    }

    override fun findTokenEnd(text: CharSequence, cursor: Int): Int {
        var i = cursor
        val len = text.length
        while (i < len) {
            if (text[i] == ',') {
                return i
            } else {
                i++
            }
        }
        return len
    }

    override fun terminateToken(text: CharSequence): CharSequence {
        var i = text.length
        while (i > 0 && text[i - 1] == ' ') {
            i--
        }
        return if (i > 0 && text[i - 1] == ',') {
            text
        } else if (text is Spanned) {
            val sp = SpannableString("$text, ")
            TextUtils.copySpansFrom(text, 0, text.length, Object::class.java, sp, 0)
            sp
        } else {
            "$text, "
        }
    }
}
