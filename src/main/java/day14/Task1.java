package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("text23");
        printSumDigits(file);

    }

    public static void printSumDigits (File file){
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String input = scanner.nextLine();
                String[] numbersWord = input.split(" ");
                if(numbersWord.length != 10){
                    try {
                        throw new Exception();
                    } catch (Exception e) {
                        System.out.println("Некорректный входной файл");
                        break;
                    }
                }
                int [] numbers = new int[10];
                int count =0;
                for(String string: numbersWord){
                    numbers[count++] = Integer.parseInt(string);
                }
                int sum=0;
                for(int integer: numbers){
                    sum+=integer;
                }
                System.out.println(sum);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }

    }
}
