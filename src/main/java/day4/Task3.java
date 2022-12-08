package day4;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int [][] numbers = new int[12][8];
        Random random = new Random();
        int indexCount = 0;
        for (int i = 0; i <numbers.length ; i++) {
            for (int j = 0; j <numbers[i].length ; j++) {
                numbers[i][j] = random.nextInt(50);
            }
        }
        int maxSum = 0;
        for (int i = 0; i <numbers.length ; i++) {
            int sum = 0;
                for (int j = 0; j <numbers[i].length ; j++) {
                    sum+=numbers[i][j];
            }
                if(maxSum<=sum){
                    maxSum= sum;
                    indexCount = i;
            }
        }
        System.out.println(indexCount);

    }
}
