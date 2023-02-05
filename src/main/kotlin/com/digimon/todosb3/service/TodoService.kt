package com.digimon.todosb3.service

import com.digimon.todosb3.entity.TodoEntity
import com.digimon.todosb3.model.TodoCreateRequest

interface TodoService {

    fun create(todoRequest: TodoCreateRequest): TodoEntity

}