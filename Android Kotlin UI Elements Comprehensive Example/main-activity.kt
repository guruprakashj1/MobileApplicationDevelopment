package com.example.uielementssample

import android.os.Bundle
import android.webkit.WebViewClient
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import com.example.uielementssample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupAutoCompleteTextView()
        setupMultiAutoCompleteTextView()
        setupWebView()
        setupVideoView()
    }

    private fun setupAutoCompleteTextView() {
        val countries = arrayOf("USA", "UK", "Germany", "France", "Italy", "Spain")
        val adapter = ArrayAdapter(this, android.R.layout.simple_dropdown_item_1line, countries)
        binding.autoCompleteTextView.setAdapter(adapter)
    }

    private fun setupMultiAutoCompleteTextView() {
        val fruits = arrayOf("Apple", "Banana", "Cherry", "Date", "Elderberry")
        val adapter = ArrayAdapter(this, android.R.layout.simple_dropdown_item_1line, fruits)
        binding.multiAutoCompleteTextView.setAdapter(adapter)
        binding.multiAutoCompleteTextView.setTokenizer(MultiAutoCompleteTextView.CommaTokenizer())
    }

    private fun setupWebView() {
        binding.webView.webViewClient = WebViewClient()
        binding.webView.loadUrl("https://www.example.com")
    }

    private fun setupVideoView() {
        val videoPath = "android.resource://${packageName}/${R.raw.sample_video}"
        binding.videoView.setVideoPath(videoPath)
        binding.videoView.start()
    }
}
