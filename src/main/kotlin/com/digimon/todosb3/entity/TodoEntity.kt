package com.digimon.todosb3.entity

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table

@Table("todos")
data class TodoEntity(
    @Id
    val id: Long,
    val title: String,
    val content: String,
    val completed: Boolean
)
