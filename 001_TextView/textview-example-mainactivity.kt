package com.example.textviewexample

import android.graphics.Color
import android.os.Bundle
import android.text.SpannableString
import android.text.SpannableStringBuilder
import android.text.Spanned
import android.text.method.LinkMovementMethod
import android.text.style.ClickableSpan
import android.text.style.ForegroundColorSpan
import android.text.style.RelativeSizeSpan
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupSpannableTextView()
        setupClickableTextView()
    }

    private fun setupSpannableTextView() {
        val textView: TextView = findViewById(R.id.spannableTextView)
        val spannable = SpannableStringBuilder("This is a SpannableStringBuilder example")

        spannable.setSpan(
            ForegroundColorSpan(Color.RED),
            0, 4,
            Spanned.SPAN_EXCLUSIVE_EXCLUSIVE
        )
        spannable.setSpan(
            RelativeSizeSpan(1.5f),
            10, 31,
            Spanned.SPAN_EXCLUSIVE_EXCLUSIVE
        )
        spannable.setSpan(
            android.text.style.StyleSpan(android.graphics.Typeface.BOLD_ITALIC),
            32, spannable.length,
            Spanned.SPAN_EXCLUSIVE_EXCLUSIVE
        )

        textView.text = spannable
    }

    private fun setupClickableTextView() {
        val textView: TextView = findViewById(R.id.clickableTextView)
        val spannableString = SpannableString("Click here to see a toast message")

        val clickableSpan = object : ClickableSpan() {
            override fun onClick(widget: View) {
                Toast.makeText(this@MainActivity, "Clicked!", Toast.LENGTH_SHORT).show()
            }
        }

        spannableString.setSpan(
            clickableSpan,
            6, 10,
            Spanned.SPAN_EXCLUSIVE_EXCLUSIVE
        )

        textView.text = spannableString
        textView.movementMethod = LinkMovementMethod.getInstance()
    }
}
