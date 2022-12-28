package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("text");
        printSumDigits(file);

    }

    public static void printSumDigits (File file){
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String input = scanner.nextLine();
                String[] numbersWord = input.split(" ");
                if(numbersWord.length != 10) throw new Exception();
                int sum=0;
                for (int i = 0; i < numbersWord.length; i++) {
                    sum+=Integer.parseInt(numbersWord[i]);
                }
                System.out.println(sum);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (Exception e) {
            System.out.println("Некорректный входной файл");
        }

    }
}
