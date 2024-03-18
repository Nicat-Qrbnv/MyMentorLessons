package lesson3.task;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        task1();

        task2();
    }

    static void task1 () {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter 3 number: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a > 0 && b > 0 && c > 0) {

            if ( a == b && a == c ) {
                System.out.println("all are equal");
            } else {
                System.out.println("numbers are not equal");
            }

        } else {
            System.out.println("Invalid input");
        }
    }

    static void task2 () {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter number of the week day to display: ");
        int day = scanner.nextInt();

        switch (day) {
            case 1:
                System.out.println("Monday"); break;
            case 2:
                System.out.println("Tuesday"); break;
            case 3:
                System.out.println("Wednesday"); break;
            case 4:
                System.out.println("Thursday"); break;
            case 5:
                System.out.println("Friday"); break;
            case 6:
                System.out.println("Saturday"); break;
            case 7:
                System.out.println("Sunday"); break;
            default:
                System.out.println("Invalid day");
        }
    }
}
