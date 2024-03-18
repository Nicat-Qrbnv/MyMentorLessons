package lesson5.exercises;

import java.util.Arrays;
import java.util.Scanner;

public class exc2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[] charArray = new char[5];

        System.out.println("Enter your name:");
        String input = scanner.nextLine();

        for (int i = 0; i < input.length(); i++) {
            charArray[i] = input.charAt(i);
        }

        System.out.println("Characters entered:");
        for (char c : charArray) {
            System.out.print(c + " ");
        }

        scanner.close();
    }
}
