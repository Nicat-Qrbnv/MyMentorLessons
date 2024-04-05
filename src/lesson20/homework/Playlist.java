package lesson20.homework;

import java.util.ArrayList;
import java.util.List;

class Playlist<T extends Playable> {
    private final List<Music> songs;
    private final List<Podcast> podcasts;

    public Playlist() {
        this.songs = new ArrayList<>();
        this.podcasts = new ArrayList<>();
    }

    public void addToList (T playable) {
        if (playable instanceof Music) {
            songs.add((Music) playable);
        } else {
            podcasts.add((Podcast) playable);
        }
    }

    public void printDetails() {
        for (Music song : songs) {
            System.out.println("Songs: ");
            System.out.println(song.getDetails());
        }
        System.out.println();
        for (Podcast podcast : podcasts) {
            System.out.println("Podcasts: ");
            System.out.println(podcast.getDetails());
        }
    }
}
