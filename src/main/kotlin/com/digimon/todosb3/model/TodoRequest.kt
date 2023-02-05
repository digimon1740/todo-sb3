package com.digimon.todosb3.model

data class TodoCreateRequest(
    val title: String,
    val content: String,
    val completed: Boolean
)
