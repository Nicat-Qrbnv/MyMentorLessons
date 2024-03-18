package lesson16;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int year = 0;
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter your birth year: ");
            try {
                year = scanner.nextInt();
                System.out.println(checkAge(year));
                break;
            } catch (InputMismatchException e ) {
                System.out.println("Sehvdir");
            } catch (WrongAgeException e) {
                System.out.println(e.getMessage());
            } finally {
                System.out.println("That is it");
            }
        }
        System.out.println(2024 - year);

    }

    public static int checkAge (int birthYear) throws WrongAgeException {
        int currentYear = 2024;
        int age = currentYear - birthYear;
        if (age >= 0 && age < 125) {
            return age;
        } else {
            throw new WrongAgeException("Enter correct age!");
        }
    }
}
