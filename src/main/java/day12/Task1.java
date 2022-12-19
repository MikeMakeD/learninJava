package day12;

import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args) {
        ArrayList<String > automobile = new ArrayList<>();
        automobile.add("Bmv");
        automobile.add("Lada");
        automobile.add("Dodge");
        automobile.add("Mercedes");
        automobile.add("Hammer");

        automobile.add(3,"Tesla");
        automobile.remove(0);
        for (String str: automobile) {
            System.out.println(str);
        }
    }
}
