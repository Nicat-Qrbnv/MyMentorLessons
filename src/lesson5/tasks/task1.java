package lesson5.tasks;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] bookDetails = new String[3];

        System.out.print("Enter book title: ");
        bookDetails[0] = scanner.nextLine();

        System.out.print("Enter book author: ");
        bookDetails[1] = scanner.nextLine();

        System.out.print("Enter publication year: ");
        bookDetails[2] = scanner.nextLine();

        System.out.println("Book Details:");
        System.out.println("    Title: " + bookDetails[0]);
        System.out.println("    Author: " + bookDetails[1]);
        System.out.println("    Publication Year: " + bookDetails[2]);
    }
}
