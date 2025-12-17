package com.example.assignmentorufy.ui.theme.webview

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class WebViewViewModel : ViewModel() {

    var currentUrl by mutableStateOf("")
        private set

    fun setInitialUrl(url: String) {
        currentUrl = url
    }

    fun updateUrl(url: String) {
        currentUrl = url
    }
}
