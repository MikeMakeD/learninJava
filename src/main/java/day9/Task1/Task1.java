package day9.Task1;

public class Task1 {
    public static void main(String[] args) {
        Student student = new Student("Mark","ITL");
        Teacher teacher = new Teacher("Lobovski","Math");
        System.out.println(student.getName());
        System.out.println(teacher.getName());
        student.printInfo();
        teacher.printInfo();
    }
}
