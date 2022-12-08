package day2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (a != b) {
            int countIter =a+1;
            while(countIter>a&& countIter<b){
                if (countIter % 5 == 0 && countIter % 10 != 0) {
                    System.out.println(countIter);
                }
                countIter++;
            }
        } else System.out.println("Некорректный ввод");
    }
}
