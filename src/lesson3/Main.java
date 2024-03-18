package lesson3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter a number: ");
//        int num = scanner.nextInt();
//
//        if (num > 10) {
//            System.out.println("Num is bigger than 10: " + num);
//        } else if (num > 0) {
//            System.out.println("Num is in between 0 and 10: " + num);
//        } else if (num == 0) {
//            System.out.println("Num is 0: " + num);
//        } else if (num > -10) {
//            System.out.println("Num is in between 0 and 10: " + num);
//        } else {
//            System.out.println("Num is smaller than -10");
//        }





        System.out.println("Bir uça bilən heyvan adı daxil et: ");
        String animal = scanner.next();
        switch (animal) {
            case "ördək", "qaz":
                System.out.println("Dünən uçan ördək gördüm");
                break;
            case "qartal":
                System.out.println("Dünən uçan qartal gördüm");
                break;
            case "it":
                System.out.println("Dünən uçan it gördüm");
                break;
            default:
                System.out.println("Heç uçan " + animal + " da olar?");
        }


        System.out.println("Enter 2 numbers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int c = (a > b) ? a-b : b - a;
        System.out.println(c);
    }

}
