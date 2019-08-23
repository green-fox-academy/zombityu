package com.example.todo.controllers;

import com.example.todo.repo.TodoRepo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/todo")
public class MainController {

  TodoRepo todoRepo;


  public MainController(TodoRepo todoRepo) {
    this.todoRepo = todoRepo;
  }

  @RequestMapping(value = "/")
  public String list(Model model){
    model.addAttribute("todos", todoRepo.findAll());
    return "todolist";
  }

  @RequestMapping(value = "/list")
  public String renderPage(){

    return "redirect:/todo/";
  }


}
