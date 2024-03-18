package lesson6;

import java.util.Arrays;

public class Lesson {
    public static void main(String[] args) {

        int[] num0 = {1, 2, 3, 12, 123, 242};
        int[] num1 = {4, 5, 6};
        int[] num2 = {7, 8, 9};

        int[][] nums = {num0, num1, num2};
        for (int[] na : nums) {

//            for (int n : na) {
//                System.out.print(n + " ");
//            }
            System.out.println(Arrays.toString(na));
//            System.out.println();
        }
    }
}
