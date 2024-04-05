package lesson19_0;

import java.util.Arrays;
import java.util.Objects;

class User {
    private static int lastId = 0;
    private int id;
    private String fullName;
    private Book[] borrowedBooks = new Book[0];

    public User(String fullName) {
        this.fullName = fullName;
        this.id = ++lastId;
    }

    public int getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public Book[] getBorrowedBooks() {
        return borrowedBooks;
    }

    public void borrowBook (Book book) {
        boolean bookExists = false;
        for (Book borrowedBook : borrowedBooks) {
            if (borrowedBook.equals(book)) {
                bookExists = true;
                break;
            }
        }
        if (!bookExists) {
            borrowedBooks = Arrays.copyOf(borrowedBooks, borrowedBooks.length+1);
            borrowedBooks[borrowedBooks.length-1] = book;
        } else {
            System.out.println("Book already borrowed by this user.");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id && Objects.equals(fullName, user.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, fullName);
    }

    public void printBorrowedBooks () {
        StringBuilder list = new StringBuilder("Borrowed books:");
        for (Book b : borrowedBooks) {
            list.append(b.toString().indent(4));
        }
    }

    @Override
    public String toString() {
        return "\nUser: %04d | %25s".formatted(id, fullName);
    }
}

