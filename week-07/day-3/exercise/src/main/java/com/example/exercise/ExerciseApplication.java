package com.example.exercise;

import com.example.exercise.services.SpellChecker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExerciseApplication implements CommandLineRunner {

  private SpellChecker checker;

  @Autowired
  public ExerciseApplication(SpellChecker checker) {
    this.checker = checker;
  }

  public static void main(String[] args) {
    SpringApplication.run(ExerciseApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    checker.checkSpelling();

  }
}
