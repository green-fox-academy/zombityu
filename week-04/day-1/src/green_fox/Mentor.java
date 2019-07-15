package green_fox;

public class Mentor extends Person{
  String level = "intermediate";

  Mentor(){}

  Mentor(String name, int age, String gender, String level){
    super.name = name;
    super.age = age;
    super.gender = gender;
    this.level = level;
  }

  @Override
  void getGoal() {
    System.out.println("Educate brilliant junior software developers.");
  }

  @Override
  void introduce() {
    System.out.println("Hi, I'm "+name+", a "+age+" year old "+gender+" "+level+" mentor.");
  }
}
