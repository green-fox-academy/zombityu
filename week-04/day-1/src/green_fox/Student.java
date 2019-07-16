package green_fox;

public class Student extends Person implements Cloneable {
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
  protected Student clone() {
    Student newClone = new Student();
    newClone.name = super.name;
    newClone.age = super.age;
    newClone.gender = super.gender;
    newClone.previousOrganization = this.previousOrganization;
    return newClone;
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
