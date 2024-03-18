package lesson5;

import java.util.Arrays;

public class Lesson {
    public static void main(String[] args) {
        //declaration and initialization of primitive type

            //declared but
        char a; //has default value:0. Allocated memory: 2 byte

            //initialized
        char b = 'b';
        a = 'a';

        //declaration and initialization of arrays

            //declared
        char[] abc; //has default value:null. Allocated memory: 0 byte

            //initialized
//        abc = new char[] {'a', 'b', 'c'};
//        for (int i = 0; i < abc.length; i++) {
//            System.out.print ( abc[i] + " ");
//        }
//        System.out.println();
//
//        for (char element : abc) {
//            System.out.print(element + " ");
//        }

        int[] num1 = new int[] {1, 2, 3};
        int[] num2 = new int[] {10, 20, 30};
        int[] num3 = new int[] {100, 200, 300};

        int[][] nums = new int[][] {num1, num2, num3};

        for (int[] ar : nums) {
            for (int e : ar) {
                System.out.print(e + " ");
            }
            System.out.println();
        }
    }
}
