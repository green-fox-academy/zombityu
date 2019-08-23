package com.example.todomysql.controllers;

import com.example.todomysql.models.Todo;
import com.example.todomysql.repository.TodoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/todo")
public class MainController {


  TodoRepo todoRepo;

  @Autowired
  public MainController(TodoRepo todoRepo) {
    this.todoRepo = todoRepo;
  }

  @GetMapping("/list")
  public String list(Model model,@RequestParam(value = "isActive", required = false) String isActive) {
    if (isActive != null) {
        model.addAttribute("todos", todoRepo.findAllByDone(isActive.equals("false")));

      } else {
        model.addAttribute("todos", todoRepo.findAll());
      }

    return "todolist";
  }

  @GetMapping("/")
  public String renderPage(){
    return "redirect:/todo/list";
  }

  @GetMapping("/add")
  public String renderAddPage(){
    return "addTodo";
  }

  @PostMapping("/add")
  public String addNewTodo(@RequestParam("title") String title){
    todoRepo.save(new Todo(title,false,false));
    return "redirect:/todo/list";
  }

  @RequestMapping(value = "/{id}/delete")
  public String deleteTodo(@PathVariable long id){
    todoRepo.deleteById(id);
    return "redirect:/todo/list";

  }

  @RequestMapping(value = "/{id}/edit")
  public String renderEditPage(@PathVariable String id, Model model){
    model.addAttribute("todo",todoRepo.findById(Long.parseLong(id)));
    return "edit";
  }

  @PostMapping("/edit")
  public String editTodo(@ModelAttribute Todo todo){
    todoRepo.save(todo);

    return "redirect:/todo/list";

  }



}

