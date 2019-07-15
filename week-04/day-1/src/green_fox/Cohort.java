package green_fox;

import java.util.*;

public class Cohort {
  String name;
  List<Student> students = new ArrayList<>();
  List<Mentor> mentors = new ArrayList<>();

  Cohort(String name){
  this.name = name;
  }

  void addStudent(Student student){
    students.add(student);
  }

  void addMentor(Mentor mentor){
    mentors.add(mentor);
  }
  void info(){
    System.out.println("The "+this.name+" has "+this.students.size()+" students and "+mentors.size()+" mentors.");
  }
}
