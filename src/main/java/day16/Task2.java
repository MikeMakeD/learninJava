package day16;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();
        try {
            PrintWriter printWriter1 = new PrintWriter("D:\\JavaMarathon2021\\src\\main\\resources\\file1.txt");
            for (int i = 0; i < 1000; i++) {
                printWriter1.println(random.nextInt(100));
            }
            printWriter1.close();
            File file1 = new File("D:\\JavaMarathon2021\\src\\main\\resources\\file1.txt");
            Scanner scanner = new Scanner(file1);
            int[] temp = new int[1000];
            while (scanner.hasNextLine()) {
                for (int i = 0; i < temp.length; i++) {
                    temp[i] = Integer.parseInt(scanner.nextLine());
                }
            }
            PrintWriter printWriter2 = new PrintWriter("D:\\JavaMarathon2021\\src\\main\\resources\\file2.txt");
            double sum = 0.0;
            for (int i = 0; i < temp.length; i++) {
                sum += (double) temp[i];
                if (i % 20 == 0) {
                    printWriter2.println(sum / 20);
                    sum = 0;
                }
            }
            printWriter2.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        File file = new File("D:\\JavaMarathon2021\\src\\main\\resources\\file2.txt");
        printResult(file);
    }
     public static void printResult(File file){
         try {
             Scanner scanner = new Scanner(file);
             double sum = 0.0;
             while (scanner.hasNextLine()){
                sum+=Double.parseDouble(scanner.nextLine());
             }
             System.out.printf("%.0f",sum);
         } catch (FileNotFoundException e) {
             e.printStackTrace();
         }

     }

}
