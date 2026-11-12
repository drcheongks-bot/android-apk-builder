package com.example.sampleapp

import android.annotation.SuppressLint
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val webView = WebView(this)
        // Enable JavaScript for your ad timer
        webView.settings.javaScriptEnabled = true
        webView.settings.domStorageEnabled = true
        webView.webViewClient = WebViewClient()

        // REPLACE WITH YOUR MAC'S IP ADDRESS (e.g., 192.168.1.50)
        val macIp = "192.168.43.23" 
        webView.loadUrl("http://$macIp:8000/fas.php?test=1&gatewayname=TEST-AP")

        setContentView(webView)
    }
}
