package lesson2.task;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        System.out.println("What is your name? ");
        String name = scanner.nextLine();

        System.out.println("How old are you? ");
        int age = scanner.nextInt();

        if (age > 0) {
            System.out.println(name + " is " + age);

            if (age < 18) {
                System.out.println(name + " is still a child");

            } else if (age < 35) {
                System.out.println(name + " is young");

            } else {
                System.out.println(name + " is adult");

            }
        } else {
            System.out.println("Age is entered incorrectly!");
        }

    }
}
