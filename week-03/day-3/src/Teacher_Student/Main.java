package Teacher_Student;

public class Main {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        Student student = new Student();

        student.question(teacher);

        teacher.teach(student);

    }

}
