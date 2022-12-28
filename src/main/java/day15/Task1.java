package day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("src\\main\\resources\\shoes.csv");
        List<String> list = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String temp = scanner.nextLine();
                String[] strings = temp.split(";");
                if (Integer.parseInt(strings[2]) == 0) {
                    list.add(temp);
                }
            }
            File file1 = new File("D:\\JavaMarathon2021\\src\\main\\resources\\missing_shoes.txt");
            file1.createNewFile();
            PrintWriter pw = new PrintWriter(file1);
            for (String shoes : list) {
                pw.println(shoes);
            }
            pw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

