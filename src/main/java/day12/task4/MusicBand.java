package day12.task4;

import java.util.ArrayList;
import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<String> listTeam;

    public MusicBand(String name, int year, List<String> listTeam) {
        this.name = name;
        this.year = year;
        this.listTeam = listTeam;
    }

    public static void transferMembers(MusicBand musicBand1, MusicBand musicBand2){
        musicBand1.listTeam.addAll(musicBand2.listTeam);
        musicBand2.listTeam.clear();
    }
    
    public void printMembers(){
        for (String members: listTeam) {
            System.out.print(members+" ");
        }
    }



    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "MusicBand{" +
                "name='" + name + '\'' +
                ", year=" + year +
                '}';
    }
}
