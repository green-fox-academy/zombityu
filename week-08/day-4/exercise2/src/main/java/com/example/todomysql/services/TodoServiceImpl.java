package com.example.todomysql.services;

import com.example.todomysql.models.Todo;
import com.example.todomysql.repository.TodoRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoServiceImpl implements TodoService {

  TodoRepo todoRepo;

  public TodoServiceImpl(TodoRepo todoRepo) {
    this.todoRepo = todoRepo;
  }


  @Override
  public List<Todo> allTodos() {
    return todoRepo.findAll();
  }

  @Override
  public Todo saveTodos(Todo todo) {
    todoRepo.save(todo);

    return todo;
  }

  @Override
  public void deleteTodos(long id) {
    todoRepo.deleteById(id);
  }

  @Override
  public Todo findTodosByid(long id) {
    return todoRepo.findById(id);
  }

  @Override
  public List<Todo> searchTodos(String search) {

    return todoRepo.findByTitle(search);
  }

  @Override
  public List<Todo> findDone(boolean isActive) {
    return todoRepo.findAllByDone(isActive);
  }



}
