package com.example.color;

import com.example.color.services.MyColor;
import com.example.color.services.PrintMyColor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ColorApplication implements CommandLineRunner {


  private MyColor color;

  public ColorApplication(PrintMyColor print) {
    this.color = print;
  }

  public static void main(String[] args) {
    SpringApplication.run(ColorApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    color.printColor();
  }
}
