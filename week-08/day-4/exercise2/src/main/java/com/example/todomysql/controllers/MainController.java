package com.example.todomysql.controllers;

import com.example.todomysql.models.Assignee;
import com.example.todomysql.models.Todo;
import com.example.todomysql.services.AssigneeService;
import com.example.todomysql.services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;


@Controller
@RequestMapping("/todo")
public class MainController {

  TodoService todoService;
  AssigneeService assigneeService;

  @Autowired
  public MainController(TodoService todoService, AssigneeService assigneeService) {
    this.todoService = todoService;
    this.assigneeService = assigneeService;
  }

  @GetMapping("/list")
  public String list(Model model, @RequestParam(value = "isActive", required = false) String isActive) {
    if (isActive != null) {
      model.addAttribute("todos", todoService.findDone(isActive.equals("false")));

    } else {
      model.addAttribute("todos", todoService.allTodos());
    }

    return "todolist";
  }

  @GetMapping("/")
  public String renderPage() {
    return "redirect:/todo/list";
  }

  @GetMapping("/add")
  public String renderAddPage() {
    return "addTodo";
  }

  @PostMapping("/add")
  public String addNewTodo(@RequestParam("title") String title,
                           @RequestParam("expire") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate expire) {

    todoService.saveTodos(new Todo(title, false, false, expire));
    return "redirect:/todo/list";
  }

  @RequestMapping(value = "/{id}/delete")
  public String deleteTodo(@PathVariable long id) {
    todoService.deleteTodos(id);
    return "redirect:/todo/list";

  }

  @RequestMapping(value = "/{id}/edit")
  public String renderEditPage(@PathVariable("id") String id,
                               Model model,
                               @ModelAttribute Todo todo) {
    model.addAttribute("todo", todoService.findTodosByid(Long.parseLong(id)));
    model.addAttribute("assignee", assigneeService.allAssignees());
    return "edit";
  }

  @PostMapping("/edit")
  public String editTodo(@ModelAttribute Todo todo) {
    todoService.saveTodos(todo);

    return "redirect:/todo/list";
  }

  @PostMapping("/search")
  public String search(Model model, @RequestParam("search") String search) {
    model.addAttribute("todos", todoService.searchTodos(search));

    return "todolist";
  }


  @GetMapping("/assignees")
  public String renderAssignees(Model model){
    model.addAttribute("assignees",assigneeService.allAssignees());

    return "assignees";
  }

  @GetMapping("/addNewAssigne")
  public String renderAddNewAssigneePage(){

    return "addAssignee";
  }

  @PostMapping("/addNewAssigne")
  public String addNewAssignee(@RequestParam("name") String name,
                               @RequestParam("email") String email){
    assigneeService.saveAssignees(new Assignee(name,email));

    return "redirect:/todo/list";
  }

  @RequestMapping(value = "/{id}/assignee/edit")
  public String renderEditAssigneePage(@PathVariable String id, Model model) {
    model.addAttribute("assignee", assigneeService.findAssignees(Integer.parseInt(id)));

    return "editassignee";
  }

  @PostMapping("/assignee/edit")
  public String editTodo(@ModelAttribute Assignee assignee) {
    assigneeService.saveAssignees(assignee);

    return "redirect:/todo/assignees";
  }

  @RequestMapping(value = "/{id}/assignee/delete")
  public String deleteAssignee(@PathVariable int id) {
    assigneeService.deleteAssignees(id);

    return "redirect:/todo/assignees";
  }


  @GetMapping("/{id}/assignee/todos")
  public String renderAssigneesTodos(Model model,
                                     @PathVariable int id){

    model.addAttribute("assignees",assigneeService.allAssignees());
    model.addAttribute("todos",assigneeService.findAssignees(id).getTodos());

    return "assignees";
  }




}


