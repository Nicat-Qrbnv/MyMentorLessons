package lesson20.homework;

// Implementing classes
class Pop implements Music {
    private String artist;
    private String title;
    private int year;

    public Pop(String artist, String title, int year) {
        this.artist = artist;
        this.title = title;
        this.year = year;
    }

    @Override
    public String getDetails() {
        return "%s - %s (%d)".formatted(title, artist, year);
    }
}
