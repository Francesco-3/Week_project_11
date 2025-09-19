package collections;

import collections.model.*;

public class Main {
    public static void main(String[] args) {
        VideoGames v = new VideoGames("VG001", 2020, 59.99, "PC", 40, Genre.RPG);
        BoardGames gdt = new BoardGames("GT001", 2018, 35.50, 4, 90);

        System.out.println(v);
        System.out.println(gdt);
    }
}
