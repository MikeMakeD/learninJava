package day12.task4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static day12.task4.MusicBand.*;

public class Task4 {
    public static void main(String[] args) {
        MusicBand mb1 = new MusicBand("Группа1",1990, new ArrayList<String>(Arrays.asList("Генна","Вова","Дима")));
        MusicBand mb2 = new MusicBand("Группа2",1990, new ArrayList<String>(Arrays.asList("Женя","Саша","Миша")));
        transferMembers(mb1,mb2);
        mb1.printMembers();
        System.out.println();
        mb2.printMembers();
    }
}
