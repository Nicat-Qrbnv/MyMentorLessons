package lesson5.tasks;

import java.util.Arrays;

public class task2 {
    public static void main(String[] args) {
        int[] ranArr = new int[10];
        for (int i = 0; i < ranArr.length; i++) {
            ranArr[i] = (int) (Math.random()*100);
        }

        System.out.println(Arrays.toString(ranArr));
        boolean sorting;
        do {
            sorting = false;
            for (int i = 0; i < ranArr.length - 1; i++) {
                if (ranArr[i] > ranArr[i + 1]) {
                    int temp = ranArr[i];
                    ranArr[i] = ranArr[i + 1];
                    ranArr[i + 1] = temp;
                    sorting = true;
                    System.out.println(Arrays.toString(ranArr));
                }
            }
        } while (sorting);
        System.out.println(Arrays.toString(ranArr));
    }
}
