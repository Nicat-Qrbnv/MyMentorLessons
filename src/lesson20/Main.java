package lesson20;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayDeque<Integer> nums= new ArrayDeque<>(2);
        nums.offer(1);
        nums.offer(3);
        nums.offer(4);
        nums.offer(3);
        System.out.println(nums.poll());

        nums.remove(3);
        System.out.println(nums);
    }
}