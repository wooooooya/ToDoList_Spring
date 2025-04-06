package com.example.ToDoList.service;

import com.example.ToDoList.Entity.ToDo;
import com.example.ToDoList.Repository.ToDoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {
    private final ToDoRepository todoRepository;

    public TodoService(ToDoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public List<ToDo> getTodos() {
        return todoRepository.findAll();
    }

    public ToDo saveTodo(ToDo todo) {
        return todoRepository.save(todo);
    }

    public void deleteTodo(Long id) {
        todoRepository.deleteById(id);
    }
}
