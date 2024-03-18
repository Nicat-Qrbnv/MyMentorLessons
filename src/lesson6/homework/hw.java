package lesson6.homework;

import java.util.Scanner;

public class hw {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[][] array = new String[3][3];

        System.out.print("Enter a string to place in the array: ");
        String inputString = scanner.nextLine();

        System.out.print("Enter the row index (0-2): ");
        int rowIndex = scanner.nextInt();
        System.out.print("Enter the column index (0-2): ");
        int columnIndex = scanner.nextInt();

        array[rowIndex][columnIndex] = inputString;

        System.out.println("Updated array:");
        for (String[] row : array) {
            for (String element : row) {
                System.out.print((element != null ? element : "-") + " ");
            }
            System.out.println();
        }
    }
}
