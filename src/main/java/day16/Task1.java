package day16;

import org.apache.commons.collections.ArrayStack;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("text");
        printResult(file);
    }
    public static void printResult(File file){
        int sum =0;
        List<Integer> numbers = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()){
                String [] strings = scanner.nextLine().split(" ");
                for (int i = 0; i <strings.length ; i++) {
                    numbers.add(Integer.parseInt(strings[i]));
                    sum+=numbers.get(i);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println((double)sum/numbers.size());
        System.out.printf("%.3f",(double)sum/numbers.size());

    }
}

