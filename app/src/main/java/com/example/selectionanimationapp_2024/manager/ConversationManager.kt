package com.example.selectionanimationapp_2024.manager

import com.example.selectionanimationapp_2024.model.MessageModel

object ConversationManager {

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

        model = MessageModel("askj askj", true)
        list.add(model)

        model = MessageModel("af", true)
        list.add(model)

        model = MessageModel("asfas qaefj", false)
        list.add(model)

        model = MessageModel("askjqwwe", true)
        list.add(model)

        model = MessageModel("wdfe  ef", true)
        list.add(model)

        model = MessageModel("45 445  ert", true)
        list.add(model)

        model = MessageModel("er g eg", true)
        list.add(model)

        model = MessageModel("erg e  521", true)
        list.add(model)

        model = MessageModel("23t 35 345", true)
        list.add(model)

        model = MessageModel("qer 3r e", false)
        list.add(model)

        model = MessageModel("eqrg eer", true)
        list.add(model)

        model = MessageModel("qer qgr", true)
        list.add(model)

        model = MessageModel("qerg gh", true)
        list.add(model)

        return list
    }
}