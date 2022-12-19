package day12.task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {

        List<MusicBand> allMusBand = new ArrayList<>(Arrays.asList(new MusicBand("Группа1",1997),
                new MusicBand("Группа2",1998),
                new MusicBand("Группа3",1999),
                new MusicBand("Группа4",2000),
                new MusicBand("Группа5",2001),
                new MusicBand("Группа6",2002),
                new MusicBand("Группа7",2003),
                new MusicBand("Группа8",2004),
                new MusicBand("Группа9",2005),
                new MusicBand("Группа10",2006)));
        List<MusicBand> newList = groupsAfter2000(allMusBand);
        for (MusicBand mb: allMusBand) {
            System.out.println(mb);
        }
        System.out.println();
        for (MusicBand mb: newList) {
            System.out.println(mb);
        }
    }
    public static List<MusicBand> groupsAfter2000(List<MusicBand> list){
        List<MusicBand> newMusicBand = new ArrayList<>();
        for (MusicBand musicBand: list) {
            if(musicBand.getYear()>=2000){
                newMusicBand.add(musicBand);
            }
        }
        return newMusicBand;
    }
}
