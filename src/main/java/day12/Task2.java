package day12;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        fill(numbers,0,30);
        fill(numbers,300,350);
        for (Integer integer: numbers) {
            System.out.println(integer);
        }
    }

    public static void fill(List list, int startInt, int lastInt){
        for (int i = startInt; i <=lastInt ; i++) {
             if(i%2==0) list.add(i);
        }
    }
}
