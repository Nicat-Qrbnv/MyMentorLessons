package lesson29.exercise1_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main1 {
    public static void main(String[] args) {
        exercise1();

        exercise2();
    }

    public static void exercise1 () {
        ArrayList<Integer> nums = new ArrayList<>(List.of (1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        nums.stream().filter(n -> n % 2 == 0).map(n -> n * n).forEach(System.out::println);
    }

    public static void exercise2 () {
        List<List<Integer>> listOfLists = new ArrayList<>(List.of(
                List.of(1, 4, 7),
                List.of(2, 5, 8),
                List.of(3, 6, 9)
        ));
        List<Integer> list = listOfLists.stream().flatMap(List::stream).sorted().toList();
        int sum = 0;
        list.stream().reduce(sum, (a, b) -> a + b);
        int mult = 1;
        list.stream().reduce(mult, (a, b) -> a * b);
        System.out.println(sum + "\n" + mult);
    }
}
