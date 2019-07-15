package green_fox;

public class Student extends Person {
  String previousOrganization = "toTheSchoolLife";
  int skippedDays = 0;


  Student(){}

  Student(String name, int age, String gender, String previousOrganization){
    super.name = name;
    super.age = age;
    super.gender = gender;
    this.previousOrganization = previousOrganization;
  }

  @Override
  void getGoal(){
    System.out.println("Be a junior software developer.");
  }

  @Override
  void introduce(){
    System.out.println("Hi, I'm "+super.name+", a "+super.age+" year old "+super.gender+
            " from "+previousOrganization+" who skipped "+skippedDays+" days from the course already.");
  }

  void skipDays(int numberOfDays){
    this.skippedDays += numberOfDays;
  }
}
