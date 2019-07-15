package Homework;

public class Person {
  String name;
  int age;
  String gender;

  Person(String name, int age, String gender){
    this.name = name;
    this.age = age;
    this.gender = gender;
  }

  void introduce(){
    System.out.println("Hi, I'm "+name+ " a "+age+" year old "+gender+".");
  }

  void getGoal(){
    System.out.println("My goal is: Live for the moment!");
  }
}
