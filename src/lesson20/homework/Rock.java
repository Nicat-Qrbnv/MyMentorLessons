package lesson20.homework;

import java.util.ArrayList;

class Rock implements Music {
    private final String artist;
    private final String title;
    private final int year;
    private final ArrayList<String> members;

    public Rock(String artist, String title, int year, ArrayList<String> members) {
        this.artist = artist;
        this.title = title;
        this.year = year;
        this.members = members;
    }


    @Override
    public String getDetails() {
        return "%s - %s %s (%d)".formatted(title, artist, members, year);
    }
}
