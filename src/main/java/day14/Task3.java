package day14;

import java.io.File;
import java.io.FileNotFoundException;
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
        Human human;
        Scanner scanner;
        try {
             scanner = new Scanner(file);
            String people= " ";
            while (scanner.hasNextLine()){
                 human = new Human();
                 people = scanner.nextLine();
                 String[] temp = people.split(" ");
                 for (int i = 0; i <temp.length ; i++) {
                     try {
                         int age = Integer.parseInt(temp[i]);
                         if(age<0){
                             try {
                                 throw new Exception();
                             } catch (Exception e) {
                                 System.out.println("Некорректный входной файл");
                                 return null;
                             }
                         }
                         human.setAge(age);
                     }catch (Exception e){
                         human.setName(temp[i]);
                     }
                 }
                peopleList.add(human);
             }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
        return peopleList;

    }
}
