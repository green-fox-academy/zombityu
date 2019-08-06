package com.greenfoxacademy.springstart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


import java.util.concurrent.atomic.AtomicLong;

@Controller
public class WebGreetCounterController {

  AtomicLong atomicLong = new AtomicLong();

  @PostMapping("/web/greeting")
  public String greeting(@RequestParam(value = "name") String name, Model model) {
    model.addAttribute("greeting",new Greeting(atomicLong.incrementAndGet(),name));
    return "greetingCounter";
  }
  }
