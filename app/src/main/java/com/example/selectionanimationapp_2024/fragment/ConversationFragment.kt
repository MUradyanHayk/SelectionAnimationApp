package com.example.selectionanimationapp_2024.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.selectionanimationapp_2024.R
import com.example.selectionanimationapp_2024.databinding.FragmentConversationBinding

class ConversationFragment : Fragment() {
    private lateinit var binding: FragmentConversationBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentConversationBinding.inflate(layoutInflater, container, false)
        return binding.root
    }
}