package com.example.selectionanimationapp_2024.adapter

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.selectionanimationapp_2024.item.ConversationItemView
import com.example.selectionanimationapp_2024.model.MessageModel

class ConversationAdapter : RecyclerView.Adapter<ConversationAdapter.ConversationViewHolder>() {
    private var list = mutableListOf<MessageModel>()

    class ConversationViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ConversationViewHolder {
        val view = ConversationItemView(parent.context)
        return ConversationViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ConversationViewHolder, position: Int) {
    }
}