package day4;

import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int volume = scanner.nextInt();
        int [] integer = new int[volume];
        Random random = new Random();
        for (int i = 0; i <integer.length; i++) {
            integer[i] = random.nextInt(11);
        }
        int eightСount = 0;
        int oneCount = 0;
        int evenCount = 0;
        int oddCount = 0;
        int sum = 0;
        for (int i: integer) {
            System.out.print(i+ " ");
            if(i>8){
                eightСount++;
            }
            if(i==1){
                oneCount++;
            }
            if(i%2==0){
                evenCount++;
            }
            else oddCount++;
            sum = sum+i;
        }
        System.out.println();
        System.out.println("Длина массива: "+integer.length);
        System.out.println("Количество чисел больше 8: " + eightСount);
        System.out.println("Количество числе равных 1: " + oneCount);
        System.out.println("Количество четных чисел: " + evenCount);
        System.out.println("Количестов нечетных чисел: " + oddCount);
        System.out.println("Сумма всех элементов массива: " + sum);
    }
}
