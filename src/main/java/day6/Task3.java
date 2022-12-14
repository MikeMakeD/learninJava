package day6;

public class Task3 {
    public static void main(String[] args) {
        Student piter = new Student();
        piter.setName("Piter");
        Teacher Smith = new Teacher("Smith","math");
        Smith.evaluate(piter);
    }
}
