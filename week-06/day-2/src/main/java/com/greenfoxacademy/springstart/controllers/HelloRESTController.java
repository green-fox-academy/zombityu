package com.greenfoxacademy.springstart.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class HelloRESTController {

  AtomicLong along = new AtomicLong();

  @GetMapping("/greeting")
  public Greeting greet(){
    Greeting greeting = new Greeting(1,"Hello, World");
    return greeting;

  }

  @PostMapping("/greeting")
  public Greeting addGreeting(@RequestParam(value = "name") String name){
    Greeting greeting = new Greeting(along.incrementAndGet(),"Hello, "+name);
    return greeting;
  }







}
