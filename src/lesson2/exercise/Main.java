package lesson2.exercise;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        exercise1();

        exercise2();



    }

    static void exercise1 () {
        double ranNum = Math.random() * 100;
        int ranInt = (int) ranNum;

        System.out.println("Random number: " + ranNum);
        System.out.println("Random integer: " + ranInt);

        if (ranInt > 0) {
            if (ranInt % 2 == 0) {
                System.out.println(ranInt + " is even!");
            } else {
                System.out.println(ranInt + " is odd");
            }
        } else {
            System.out.println(ranInt + " is zero");
        }
    }

    static void exercise2 () {

        Scanner scanner = new Scanner (System.in);
        System.out.println("Is dog barking? (true/false) ");
        boolean isBarking = scanner.nextBoolean();

        System.out.println("Is it night? (true/false) ");
        boolean isNight = scanner.nextBoolean();

        if (isBarking) {
            if (isNight) {
                System.out.println("Wake up!🏃‍♂️");
            } else {
                System.out.println("Dogs sometimes bark.🤷‍♂️");
            }
        } else {
            System.out.println("🛌💤");
        }
    }

    static void exercise3 () {

        double ranNum = Math.random() * 10;

        int ranInt = (int) ranNum;
    }
}
