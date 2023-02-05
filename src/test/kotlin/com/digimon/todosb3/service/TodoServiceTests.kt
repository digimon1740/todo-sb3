package com.digimon.todosb3.service

import com.digimon.todosb3.model.TodoCreateRequest
import org.junit.jupiter.api.Test

class TodoServiceTests {

    val todoService: TodoService = TodoServiceImpl()

    @Test
    fun `TodoRequest를 전달하면 TodoEntity를 생성한다`() {
        // Given
        val todoRequest = TodoCreateRequest(
            title = "테스트 제목",
            content = "테스트 컨텐츠",
            completed = false
        )

        // When
        val actual = todoService.create(todoRequest)

        // Then
        assert(actual.title == todoRequest.title)
        assert(actual.content == todoRequest.content)

    }
}