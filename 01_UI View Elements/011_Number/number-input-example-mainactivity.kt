package com.example.numberinputexample

import android.os.Bundle
import android.text.InputFilter
import android.text.Spanned
import android.text.method.DigitsKeyListener
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.widget.addTextChangedListener
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout
import java.text.DecimalFormat
import java.text.NumberFormat
import java.util.*

class MainActivity : AppCompatActivity() {

    private lateinit var regularNumberLayout: TextInputLayout
    private lateinit var signedNumberLayout: TextInputLayout
    private lateinit var decimalNumberLayout: TextInputLayout

    private lateinit var regularNumberEditText: TextInputEditText
    private lateinit var signedNumberEditText: TextInputEditText
    private lateinit var decimalNumberEditText: TextInputEditText

    private lateinit var submitButton: Button
    private lateinit var resultTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize views
        regularNumberLayout = findViewById(R.id.regularNumberLayout)
        signedNumberLayout = findViewById(R.id.signedNumberLayout)
        decimalNumberLayout = findViewById(R.id.decimalNumberLayout)

        regularNumberEditText = findViewById(R.id.regularNumberEditText)
        signedNumberEditText = findViewById(R.id.signedNumberEditText)
        decimalNumberEditText = findViewById(R.id.decimalNumberEditText)

        submitButton = findViewById(R.id.submitButton)
        resultTextView = findViewById(R.id.resultTextView)

        // Set up input filters and formatters
        setupRegularNumberInput()
        setupSignedNumberInput()
        setupDecimalNumberInput()

        // Set click listener for the submit button
        submitButton.setOnClickListener {
            handleSubmit()
        }
    }

    private fun setupRegularNumberInput() {
        regularNumberEditText.filters = arrayOf<InputFilter>(InputFilter.LengthFilter(10))
        regularNumberEditText.keyListener = DigitsKeyListener.getInstance("0123456789")
    }

    private fun setupSignedNumberInput() {
        signedNumberEditText.filters = arrayOf<InputFilter>(InputFilter.LengthFilter(11))
        signedNumberEditText.keyListener = DigitsKeyListener.getInstance(true, false)
    }

    private fun setupDecimalNumberInput() {
        val decimalDigits = 2
        val decimalFormatter = DecimalFormat().apply {
            maximumFractionDigits = decimalDigits
            isDecimalSeparatorAlwaysShown = false
        }

        decimalNumberEditText.filters = arrayOf(DecimalDigitsInputFilter(decimalDigits))
        decimalNumberEditText.addTextChangedListener { text ->
            if (text != null && text.isNotEmpty()) {
                val parsed = text.toString().toDoubleOrNull()
                if (parsed != null) {
                    val formatted = decimalFormatter.format(parsed)
                    if (formatted != text.toString()) {
                        decimalNumberEditText.setText(formatted)
                        decimalNumberEditText.setSelection(formatted.length)
                    }
                }
            }
        }
    }

    private fun handleSubmit() {
        val regularNumber = regularNumberEditText.text.toString()
        val signedNumber = signedNumberEditText.text.toString()
        val decimalNumber = decimalNumberEditText.text.toString()

        var isValid = true
        var resultMessage = ""

        if (regularNumber.isEmpty()) {
            regularNumberLayout.error = "Please enter a number"
            isValid = false
        } else {
            regularNumberLayout.error = null
            resultMessage += "Regular Number: $regularNumber\n"
        }

        if (signedNumber.isEmpty()) {
            signedNumberLayout.error = "Please enter a signed number"
            isValid = false
        } else {
            signedNumberLayout.error = null
            resultMessage += "Signed Number: $signedNumber\n"
        }

        if (decimalNumber.isEmpty()) {
            decimalNumberLayout.error = "Please enter a decimal number"
            isValid = false
        } else {
            decimalNumberLayout.error = null
            resultMessage += "Decimal Number: $decimalNumber\n"
        }

        if (isValid) {
            resultTextView.text = "Submitted Numbers:\n$resultMessage"
        } else {
            resultTextView.text = "Please correct the errors in the form"
        }
    }

    inner class DecimalDigitsInputFilter(private val decimalDigits: Int) : InputFilter {
        override fun filter(
            source: CharSequence,
            start: Int,
            end: Int,
            dest: Spanned,
            dstart: Int,
            dend: Int
        ): CharSequence? {
            var dotPos = -1
            val len = dest.length
            for (i in 0 until len) {
                val c = dest[i]
                if (c == '.' || c == ',') {
                    dotPos = i
                    break
                }
            }
            if (dotPos >= 0) {
                // protects against many dots
                if (source == "." || source == ",") {
                    return ""
                }
                // if the text is entered before the dot
                if (dend <= dotPos) {
                    return null
                }
                if (len - dotPos > decimalDigits) {
                    return ""
                }
            }
            return null
        }
    }
}
