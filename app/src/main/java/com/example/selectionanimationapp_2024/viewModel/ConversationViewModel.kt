package com.example.selectionanimationapp_2024.viewModel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.example.selectionanimationapp_2024.manager.ConversationManager
import com.example.selectionanimationapp_2024.model.MessageModel

class ConversationViewModel(application: Application) : AndroidViewModel(application) {
    fun getDataSource():List<MessageModel> {
        return ConversationManager.getDataSource()
    }
}