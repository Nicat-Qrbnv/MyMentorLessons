package Test;

import java.util.Random;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        int[] ria = {-10, -5, -20, -7, -8, -15, -12, -3, -25, -18, -30, -9, -14, -22, -35, -11, -40, -13, -16, -28};

    }

    public static void FindMax (int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {

            if (i == 0) {
                max = arr[0];
            } else if (arr[i] > max) {
                max = arr[i];
            }
        }
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // Partition the array and get the index of the pivot element
            int pivotIndex = partition(arr, low, high);

            // Recursively sort the sub-arrays
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    public static int partition(int[] arr, int low, int high) {
        // Choose the pivot (in this case, the last element)
        int pivot = arr[high];

        // Index of the smaller element
        int i = low - 1;

        // Traverse the array and rearrange elements
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Swap arr[i + 1] and arr[high] (put the pivot in its correct position)
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        // Return the index of the pivot element
        return i + 1;
    }
}
