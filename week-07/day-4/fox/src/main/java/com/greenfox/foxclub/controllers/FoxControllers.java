package com.greenfox.foxclub.controllers;

import com.greenfox.foxclub.models.Fox;
import com.greenfox.foxclub.models.Trick;
import com.greenfox.foxclub.services.FoxesServices;
import com.greenfox.foxclub.services.TrickService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FoxControllers {

  FoxesServices foxesServices;
  TrickService trickService;

  @Autowired
  public FoxControllers(FoxesServices foxesServices, TrickService trickService) {
    this.foxesServices = foxesServices;
    this.trickService = trickService;
  }

  @GetMapping("/nutritionStore")
  public String renderNutritionPage(@RequestParam(value = "name")String name, Model model){
    model.addAttribute("name",name);
    return "nutrition";
  }

  @PostMapping("/nutritionStore")
  public String changeNutrition(@RequestParam("name") String name,
                                @RequestParam("food") String food,
                                @RequestParam("drink") String drink){

    Fox fox = foxesServices.getFox(foxesServices.findAll(),name);
    fox.setFood(food);
    fox.setDrink(drink);

    return "redirect:/?name="+name;
  }

  @GetMapping("/trickCenter")
  public String renderTrickPage(@RequestParam("name")String name, Model model){
    model.addAttribute("name",name);
    model.addAttribute("tricks",trickService.availableTricks(foxesServices.getFox(foxesServices.findAll(),name).getTricks(),trickService.allTricks()));
    return "trickCenter";
  }

  @PostMapping("/trickCenter")
  public String learnTricks(@RequestParam("name") String name,
                            @RequestParam("tricks") String tricks){

    Fox fox = foxesServices.getFox(foxesServices.findAll(),name);
    fox.learnTricks(tricks);


    return "redirect:/?name="+name;

  }

}
