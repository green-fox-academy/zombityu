package com.greenfox.demo.controllers;

import com.greenfox.demo.Repository.LogRepo;
import com.greenfox.demo.models.*;
import com.greenfox.demo.models.Number;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class RestControllers {


  LogRepo log;

  @Autowired
  public RestControllers(LogRepo log) {
    this.log = log;
  }

  @GetMapping("/doubling")
  public ResponseEntity doubleTheNumber(@RequestParam(value = "input", required = false) String input){
    log.save(new Log("/doubling",input));
    if (input != null){
      DoublingNumber newNumber = new DoublingNumber(Integer.parseInt(input));
      return ResponseEntity.status(200).body(newNumber);
    }else{
      ErrorName name = new ErrorName("Please provide an input!");
      return ResponseEntity.status(200).body(name);
    }
  }

  @GetMapping("/greeter")
  public ResponseEntity greeter(@RequestParam(value ="name" , required = false)String name,
                                @RequestParam(value = "title", required = false)String title){
    log.save(new Log("/greeter",name+title));

    if (name != null && title != null){
      Welcome welcome = new Welcome("Oh, hi there "+name+", my dear "+title+"!");
      return ResponseEntity.status(200).body(welcome);
    } else if (name != null) {
      ErrorName titleError = new ErrorName("Please provide a title!");
      return ResponseEntity.status(200).body(titleError);
    }else if (title != null){
      ErrorName nameError = new ErrorName("Please provide a name!");
      return ResponseEntity.status(200).body(nameError);
    }else{
      ErrorName otherError = new ErrorName("Please provide a name and a title!");
      return ResponseEntity.status(200).body(otherError);
    }
  }

  @GetMapping("/appenda/{appendable}")
  public ResponseEntity append(@PathVariable String appendable){
    log.save(new Log("/appenda",appendable));
    if (appendable != null){
      Append app = new Append(appendable);
      return ResponseEntity.status(200).body(app);
    } else {
      return ResponseEntity.status(404).build();
    }
  }

  @PostMapping("/dountil/{action}")
  public ResponseEntity action(@PathVariable String action,
                               @RequestBody Number number){
    log.save(new Log("/dountil/{action}",number.toString()));
    if (number != null){
      Result result = new Result();
      if (action.equals("sum")) {
        result.sum(number.getUntil());

        return ResponseEntity.status(200).body(result);

      } else if (action.equals("factor")){
        result.factor(number.getUntil());

        return ResponseEntity.status(200).body(result);
      } else {

        return ResponseEntity.status(404).build();
      }
    } else {
      ErrorName untilError = new ErrorName("Please provide a number!");

      return ResponseEntity.status(200).body(untilError);
    }
  }

  @PostMapping("/arrays")
  public ResponseEntity arrayNumbers(@RequestBody WhatAreYouDoin what){

    if (what != null){
      NumberResult result = new NumberResult();
      if (what.getWhat().equals("sum")){
        result.sum(what.getNumbers());

        return ResponseEntity.status(200).body(result);
      } else if (what.getWhat().equals("multiply")){
        result.multiply(what.getNumbers());

        return ResponseEntity.status(200).body(result);
      } else if (what.getWhat().equals("double")){
        ArrayResult arrayResult = new ArrayResult();
        arrayResult.arrayDouble(what.getNumbers());

        return ResponseEntity.status(200).body(arrayResult);
      }

    }
      ErrorName name = new ErrorName("Please provide what to do with the numbers!");
      return ResponseEntity.status(200).body(name);

  }


  @GetMapping("/log")
  public ResponseEntity logs(){
    LogList list = new LogList(log.findAll());
    list.setEntry_count(list.getEntries().size());

    return ResponseEntity.status(200).body(list);
  }
}
