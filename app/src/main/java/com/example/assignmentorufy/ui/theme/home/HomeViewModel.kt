package com.example.assignmentorufy.ui.theme.home

import android.util.Patterns
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {

    var url by mutableStateOf("")
        private set

    fun onUrlChange(value: String) {
        url = value
    }

    fun validateUrl(): String? {
        val trimmed = url.trim()
        if (trimmed.isEmpty()) return "URL cannot be empty"

        val finalUrl =
            if (!trimmed.startsWith("http")) "https://$trimmed"
            else trimmed

        return if (Patterns.WEB_URL.matcher(finalUrl).matches())
            null
        else
            "Please enter a valid URL"
    }

    fun getFinalUrl(): String {
        val trimmed = url.trim()
        return if (!trimmed.startsWith("http")) "https://$trimmed" else trimmed
    }
}
