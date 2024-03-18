package lesson4.Tasks;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        int num = scanner.nextInt();

        if (num >= 0) {
            int sum = 0;
            while (num > 0) {
                int dig = num % 10;
                num = num / 10;
                if (dig % 2 != 0) {
                    continue;
                }
                sum += dig;
            }
            System.out.println("Sum is: " + sum);
        } else {
            System.out.println("Only positive numbers are accepted!");
        }

    }
}
