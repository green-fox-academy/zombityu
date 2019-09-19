package com.example.todomysql.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Assignee {

  @Id
  @GeneratedValue
  private int id;
  private String name;
  private String email;

  @OneToMany(cascade = CascadeType.ALL)
  @JoinColumn(name = "assignee_id")
  List<Todo> todos;

  public Assignee() {
  }

  public Assignee(String name, String email) {
    this.name = name;
    this.email = email;
    this.todos = new ArrayList<>();
  }



  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public List<Todo> getTodos() {
    return todos;
  }

  public void setTodos(List<Todo> todos) {
    this.todos = todos;
  }

  public void addTodo(Todo newTodo){
    this.todos.add(newTodo);
  }

}
