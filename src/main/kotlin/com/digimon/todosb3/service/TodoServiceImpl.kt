package com.digimon.todosb3.service

import com.digimon.todosb3.entity.TodoEntity
import com.digimon.todosb3.model.TodoCreateRequest
import org.springframework.stereotype.Service

@Service
class TodoServiceImpl : TodoService {

    override fun create(todoRequest: TodoCreateRequest): TodoEntity {
        return TodoEntity(
            id = 1,
            title = todoRequest.title,
            content = todoRequest.content,
            completed = todoRequest.completed
        )
    }
}