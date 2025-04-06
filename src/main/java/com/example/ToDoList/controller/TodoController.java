package com.example.ToDoList.controller;

import com.example.ToDoList.Entity.ToDo;
import com.example.ToDoList.service.TodoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/todos")
public class TodoController {

    private final TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @GetMapping
    public List<ToDo> getTodos() {
        return todoService.getTodos();
    }

    @PostMapping
    public ToDo addTodo(@RequestBody ToDo todo) {
        return todoService.saveTodo(todo);
    }

    @DeleteMapping("/{id}")
    public void deleteTodo(@PathVariable Long id) {
        todoService.deleteTodo(id);
    }
}
