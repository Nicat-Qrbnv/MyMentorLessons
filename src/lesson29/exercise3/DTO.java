package lesson29.exercise3;

class DTO {
    private final String title;
    private final String authorName;
    private final int yearPublished;

    public DTO(String title, String authorName, int yearPublished) {
        this.title = title;
        this.authorName = authorName;
        this.yearPublished = yearPublished;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthorName() {
        return authorName;
    }

    public int getYearPublished() {
        return yearPublished;
    }
}