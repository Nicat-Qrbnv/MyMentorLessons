package lesson19_0;

import java.util.Arrays;

class Library {
    private String name;
    private Book[] books;
    private User[] users;

    public Library(String name) {
        this.name = name;
    }

    public void addBook(Book book) {
        boolean bookExists = false;
        for (Book borrowedBook : books) {
            if (borrowedBook.equals(book)) {
                bookExists = true;
                break;
            }
        }
        if (!bookExists) {
            books = Arrays.copyOf(books, books.length+1);
            books[books.length-1] = book;
        } else {
            System.out.println("Book already borrowed by this user.");
        }
    }

    public void addUser (User user) {
        boolean userExists = false;
        for (User u : users) {
            if (u.equals(user)) {
                userExists = true;
                break;
            }
        }
        if (!userExists) {
            users = Arrays.copyOf(users, users.length+1);
            users[users.length-1] = user;
        } else {
            System.out.println("User already exists.");
        }
    }

    public void printUsers() {
        StringBuilder list = new StringBuilder("Users:");
        for (User u : users) {
            list.append(u);
        }
    }

    public void printBooks () {
        StringBuilder list = new StringBuilder("Books:");
        for (Book b : books) {
            list.append(b);
        }
    }
}

