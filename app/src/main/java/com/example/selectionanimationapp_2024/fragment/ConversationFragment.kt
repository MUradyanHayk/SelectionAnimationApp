package com.example.selectionanimationapp_2024.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import com.example.selectionanimationapp_2024.R
import com.example.selectionanimationapp_2024.adapter.ConversationAdapter
import com.example.selectionanimationapp_2024.databinding.FragmentConversationBinding
import com.example.selectionanimationapp_2024.viewModel.ConversationViewModel

class ConversationFragment : Fragment() {
    private lateinit var binding: FragmentConversationBinding
    private var adapter: ConversationAdapter? = null
    private val viewModel by lazy {
        ViewModelProvider(this)[ConversationViewModel::class.java]
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentConversationBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        adapter = ConversationAdapter(viewModel.getDataSource())
        binding.recyclerView.adapter = adapter
    }
}