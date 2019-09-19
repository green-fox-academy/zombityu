package com.greenfox.foxclub.controllers;

import com.greenfox.foxclub.models.Fox;
import com.greenfox.foxclub.services.FoxesServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

  @Autowired
  private FoxesServices foxesServices;

  public MainController(FoxesServices foxesServices) {
    this.foxesServices = foxesServices;
  }

  @GetMapping("/")
  public String renderHomePage(Model model,@RequestParam(value="name" , required = false)String name){
    if (name == null || name == ""){
      return "redirect:/login";
    }
      model.addAttribute("name", foxesServices.getFox(foxesServices.findAll(),name));

    return "index";
  }

  @GetMapping("/login")
  public String renderLoginPage(){
    return "login";
  }

  @PostMapping("/login")
  public String loginPost(Model model, @RequestParam(value = "name")String name){
    model.addAttribute("name", name);
    foxesServices.setFox(name);
    return "redirect:/?name="+name;
  }




}
