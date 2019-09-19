package com.example.color.contollers;

import com.example.color.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreenFoxControllers {

  @Autowired
  private StudentService student;

  public GreenFoxControllers(StudentService service) {
    this.student=service;
  }

  @GetMapping("/gfa")
  public String getHome(){
    return "greenHome";
  }

  @GetMapping("/gfa/list")
  public String getList(Model model){
    model.addAttribute("students",student.findAll());
    return "greenList";
  }

  @GetMapping("/gfa/add")
  public String getAdd(){
    return "addStudent";
  }

  @PostMapping("/gfa/save")
  public String addName(@RequestParam(value = "name")String name){
    student.save(name);
    return "redirect:/gfa";
  }

}
