package com.digimon.todosb3.api

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.concurrent.Callable
import java.util.concurrent.Executors

@RestController
@RequestMapping("/v1/api/todos")
class TodoController {


    @GetMapping
    fun hello(): String {
        val response = Executors.newVirtualThreadPerTaskExecutor().use { executor ->
            val future = executor.submit(Callable {
                "Hello"
            })
            val future2 = executor.submit(Callable {
                "World!"
            })
            listOf(future, future2)
        }
        return response.joinToString { it.get() }
    }
}