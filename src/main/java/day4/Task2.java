package day4;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int [] numbers = new int[100];
        Random random = new Random();
        for (int i = 0; i <numbers.length ; i++) {
            numbers[i] = random.nextInt(10000);
        }
        int max = numbers[0];
        int min = numbers[0];
        int nullCount = 0;
        int nullSum = 0;
        for (int number:numbers) {
            if(max<number){
                max = number;
            }
            if(min>number){
                min = number;
            }
            if(number%10==0){
                nullCount++;
                nullSum = nullSum+number;
            }
        }
        System.out.println(max);
        System.out.println(min);
        System.out.println(nullCount);
        System.out.println(nullSum);
    }
}
