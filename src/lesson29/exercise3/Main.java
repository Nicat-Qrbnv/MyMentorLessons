package lesson29.exercise3;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<DTO> dtos = Arrays.asList(
                new DTO("Book1", "Author1", 2000),
                new DTO("Book2", "Author2", 2005),
                new DTO("Book3", "Author3", 2010)
        );

        List<Book> books = dtos.stream()
                .map(dto -> new Book(dto.getTitle(), dto.getYearPublished()))
                .toList();

        List<Author> authors = dtos.stream()
                .map(dto -> new Author(dto.getAuthorName()))
                .toList();

        System.out.println("Books:");
        books.forEach(System.out::println);

        System.out.println("\nAuthors:");
        authors.forEach(System.out::println);
    }
}