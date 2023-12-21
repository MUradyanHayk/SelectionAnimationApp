package com.example.selectionanimationapp_2024.adapter

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.selectionanimationapp_2024.item.ConversationItemView
import com.example.selectionanimationapp_2024.model.MessageModel

class ConversationAdapter(private var list:List<MessageModel>) : RecyclerView.Adapter<ConversationAdapter.ConversationViewHolder>() {
    class ConversationViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ConversationViewHolder {
        val view = ConversationItemView(parent.context)
        return ConversationViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ConversationViewHolder, position: Int) {
        val item = holder.itemView as ConversationItemView
        item.configure(list[position])
    }
}