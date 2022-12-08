package day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a;
        double b;
        double c;
        int countIter= 0;
        while (countIter<5){
            a = scanner.nextDouble();
            b = scanner.nextDouble();
            if(b==0){
                System.out.println("Деление на 0");
                continue;
            }
            c = a/b;
            System.out.println(c);
            countIter++;
        }
    }
}
