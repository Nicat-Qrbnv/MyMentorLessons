package lesson20.homework;

class Meykhana implements Music {
    private final String artist;
    private final String title;
    private final int year;

    public Meykhana(String artist, String title, int year) {
        this.artist = artist;
        this.title = title;
        this.year = year;
    }

    @Override
    public String getDetails() {
        return "%s - %s (%d)".formatted(title, artist, year);
    }
}
