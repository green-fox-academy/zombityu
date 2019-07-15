package green_fox;

public class Sponsor extends Person {
  String company = "Google";
  int hiredStudents;

  Sponsor(){}

  Sponsor(String name, int age, String gender, String company){
    super.name = name;
    super.age = age;
    super.gender = gender;
    this.company = company;
    this.hiredStudents = 0;
  }

  @Override
  void introduce() {
    System.out.println("Hi, I'm "+name+", a "+age+" year old "+gender+
            " who represents "+company+" and hired "+hiredStudents+" students so far.");
  }

  void hire(){
    this.hiredStudents++;
  }

  @Override
  void getGoal() {
    System.out.println("Hire brilliant junior software developers.");
  }
}
