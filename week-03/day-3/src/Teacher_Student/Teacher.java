package Teacher_Student;

public class Teacher {
    String answer;


    void answer(){
        System.out.println("I'm answered youre question.");
    }

    void teach(Student student){
        student.learn();
    }

}
