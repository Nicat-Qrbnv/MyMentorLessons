package lesson20.homework;

import java.util.ArrayList;
import java.util.List;

public class GenericsExercise {
    public static void main(String[] args) {
        Playlist<Playable> playlist = new Playlist<>();

        playlist.addToList(new Pop("Taylor Swift", "Shake It Off", 2014));
        ArrayList<String> queen = new ArrayList<>(List.of("Freddie Mercury", "Brian May", "Roger Taylor", "John Deacon"));
        playlist.addToList(new Rock("Queen", "Bohemian Rhapsody", 1975,queen));
        playlist.addToList(new Meykhana("Snoop Dogg", "Meykhana 2023", 2023));
        playlist.addToList(new Podcast("Podcast Episode 1"));

        System.out.println("Details of songs in the playlist:");
        playlist.printDetails();
    }
}
