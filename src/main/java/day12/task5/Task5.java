package day12.task5;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static day12.task5.MusicBand.*;
import static day12.task5.MusicArtist.*;

public class Task5 {
    public static void main(String[] args) {
        MusicBand mb1 = new MusicBand("Группа1",1990,
                new ArrayList<>(Arrays.asList(new MusicArtist("Женя",12), new MusicArtist("Андрей",34), new MusicArtist("Гоша",23))));
        MusicBand mb2 = new MusicBand("Группа2",1990,
                new ArrayList<>(Arrays.asList(new MusicArtist("Дима",12), new MusicArtist("Гена",34), new MusicArtist("Черт",23))));
        transferMembers(mb1,mb2);
        mb1.printMembers();
        System.out.println();
        mb2.printMembers();
    }
}
