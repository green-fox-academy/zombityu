package Homework;

public class Student {
  String name;
  int age;
  String gender;
  String previousOrganization;
  int skippedDays;

  Student(String name, int age, String gender, String previousOrganization ){
    this.name = name;
    this.age = age;
    this.gender = gender;
  }

  void introduce(){
    System.out.println("Hi, I'm "+name+ " a "+age+" year old "+gender+","+"from "+previousOrganization+" who skipped "+skippedDays+" days from the course already");
  }

  void getGoal(){
    System.out.println("Be a junior software developer.");
  }

  void skipDays(int numberOfDays){
    this.skippedDays+=numberOfDays;
  }

}
