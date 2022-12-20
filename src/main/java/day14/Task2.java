package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        File file = new File("people1");
        System.out.println(parseFileToString(file));


    }
    public static List<String> parseFileToString(File file){
        List<String> peopleList = new ArrayList<>();
        Scanner scanner;
        try {
            StringBuilder stringBuilder = new StringBuilder();
            scanner = new Scanner(file);
            String tempStr ="";
            while (scanner.hasNextLine()){
                tempStr = scanner.nextLine();
                peopleList.add(tempStr);
                stringBuilder.append(tempStr);
                stringBuilder.append(" ");
            }
            List<String> stringsList = new ArrayList<>();
            String str = stringBuilder.toString();
            stringsList = Arrays.asList(str.split(" "));
            for (int i = 1; i <stringsList.size() ; i+=2) {
                int temp = Integer.parseInt(stringsList.get(i));
                if(temp<0){
                    try {
                        throw new Exception();
                    } catch (Exception e) {
                        System.out.println("Некорректный входной файл");
                        return null;
                    }
                }
            }


        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");

        }

        return peopleList;
    }

}
