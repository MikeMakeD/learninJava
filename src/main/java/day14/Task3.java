package day14;

import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        File file = new File("people");
        System.out.println(parseFileToObject(file));
    }

    public static List<Human> parseFileToObject(File file){
        List<Human> peopleList = new ArrayList<>();

        Scanner scanner;
        try {
            scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String[] temp = scanner.nextLine().split(" ");
                if (Integer.parseInt(temp[1]) < 0) throw new Exception();
                Human human = new Human(temp[0],Integer.parseInt(temp[1]));
                peopleList.add(human);
            }
            return peopleList;
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (Exception e) {
            System.out.println("Некорректный входной файл");
        }
        return null;

    }
}
