package lesson12.homework;

import java.util.Objects;

class Song {

    private String title;
    private String artist;
    private int duration;

    Song(String title, String artist, int duration) {
        this.title = title;
        this.artist = artist;
        this.duration = duration;
    }

    String getTitle() {
        return title;
    }

    void setTitle(String title) {
        this.title = title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Song song = (Song) o;
        return duration == song.duration
                && Objects.equals(title, song.title)
                && Objects.equals(artist, song.artist);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, artist, duration);
    }

    @Override
    public String toString() {
        return "%-20s - %-25s [%02d:%02d]".formatted(title, artist, duration/60, duration%60);
    }
}
