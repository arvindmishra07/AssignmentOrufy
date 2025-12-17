package com.example.assignmentorufy.ui.theme.history

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.assignmentorufy.data.local.dao.UrlDao
import com.example.assignmentorufy.data.local.entity.UrlEntity
import kotlinx.coroutines.launch

class HistoryViewModel(
    private val dao: UrlDao
) : ViewModel() {

    var historyList by mutableStateOf<List<UrlEntity>>(emptyList())
        private set

    fun loadHistory() {
        viewModelScope.launch {
            historyList = dao.getAllUrls()
        }
    }

    fun clearHistory() {
        viewModelScope.launch {
            dao.clearAll()
            historyList = emptyList()
        }
    }
}
