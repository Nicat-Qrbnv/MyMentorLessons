package lesson20.homework;

class Podcast implements Playable {
    private final String title;

    public Podcast (String title) {
        this.title = title;
    }

    @Override
    public String getDetails() {
        return title;
    }
}
