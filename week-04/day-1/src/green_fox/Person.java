package green_fox;

public class Person {
  String name = "Jane Doe";
  int age = 30;
  String gender = "female";

  Person(){}

  Person(String name, int age, String gender){
    this.name = name;
    this.age = age;
    this.gender = gender;
  }



 void introduce(){
   System.out.println("Hi, I'm"+name+", a "+age+" year old "+gender+".");
 }

 void getGoal(){
   System.out.println("My goal is: Live for the moment!");
  }


}
