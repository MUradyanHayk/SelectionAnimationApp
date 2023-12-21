package com.example.selectionanimationapp_2024.manager

import com.example.selectionanimationapp_2024.model.MessageModel

class ConversationManager {

    fun getDataSource(): List<MessageModel> {
        val list = mutableListOf<MessageModel>()

//        var model = MessageModel("askj askj", Random.nextBoolean())
        var model = MessageModel("askj askj", true)
        list.add(model)

        model = MessageModel("askj askj", false)
        list.add(model)

        model = MessageModel("askj", true)
        list.add(model)

        model = MessageModel("Adfasd asdf", true)
        list.add(model)

        model = MessageModel("aSDF A", true)
        list.add(model)

        model = MessageModel("ASD  AS", false)
        list.add(model)

        model = MessageModel("aASFSDj", true)
        list.add(model)

        model = MessageModel("ada 4skj", false)
        list.add(model)

        model = MessageModel("a askj", true)
        list.add(model)

        model = MessageModel("askj askj", true)
        list.add(model)

        model = MessageModel("askj askj", true)
        list.add(model)

        model = MessageModel("askj askj", false)
        list.add(model)

        model = MessageModel("askj askj", false)
        list.add(model)

        model = MessageModel("askj askj", false)
        list.add(model)

        model = MessageModel("askj askj", true)
        list.add(model)

        return list
    }
}