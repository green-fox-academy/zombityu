package com.webshop.webshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class WebshopApplication {

  public static void main(String[] args) {
    SpringApplication.run(WebshopApplication.class, args);
  }


@GetMapping("/webshop")
  public String hello() {
    return "Hello World";
}
}

