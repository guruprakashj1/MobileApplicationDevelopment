package com.example.webviewdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Find the WebView in the layout
        val webView: WebView = findViewById(R.id.webView)

        // Enable JavaScript (optional, but often necessary for modern websites)
        webView.settings.javaScriptEnabled = true

        // Set a WebViewClient to handle page navigation within the WebView
        webView.webViewClient = WebViewClient()

        // Load a URL
        webView.loadUrl("https://www.example.com")
    }

    // Handle back button presses to navigate within the WebView
    override fun onBackPressed() {
        val webView: WebView = findViewById(R.id.webView)
        if (webView.canGoBack()) {
            webView.goBack()
        } else {
            super.onBackPressed()
        }
    }
}
