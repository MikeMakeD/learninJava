package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        File file = new File("people");
        System.out.println(parseFileToString(file));


    }

    public static List<String> parseFileToString(File file) {
        List<String> peopleList = new ArrayList<>();
        Scanner scanner;
        try {
            scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                peopleList.add(scanner.nextLine());
                String[] strings = peopleList.get(0).split(" ");
                if (Integer.parseInt(strings[1]) == 0) throw new Exception();
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (Exception e) {
            System.out.println("Некорректный входной файл");
            return null;
        }
        return peopleList;
    }

}
