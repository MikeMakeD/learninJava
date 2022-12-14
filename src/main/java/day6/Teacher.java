package day6;

import java.util.Random;

public class Teacher {
    private String name;
    private String subject;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public String getSubject() {
        return subject;
    }


    void evaluate(Student student){
        Random random = new Random();
        String grade ="";
        int num = 2 + random.nextInt(3);
        switch (num){
            case (2):
                 grade ="неудовлетворительно";
                 break;
            case (3):
                 grade ="удовлетворительно";
                 break;
            case (4):
                 grade ="хорошо";
                 break;
            case (5):
                 grade ="отлично";
                 break;
        }

        System.out.println("Преподователь "+getName()+" оценил студента с именем "+student.getName()+" по предмету " + getSubject()+ " на оценку "+grade);
    }
}
