package lesson22;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = new int[] {5, 3, 1, 7, 8};
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        Fruit[] fruits = new Fruit[3];
        Fruit f1 = new Fruit("apple", 0.1, Color.RED);
        Fruit f2 = new Fruit("strawberry", 5, Color.RED);
        Fruit f3 = new Fruit("pomegranate", 2, Color.YELLOW);
        fruits[0] = f1;
        fruits[1] = f2;
        fruits[2] = f3;
//        Arrays.sort(fruits, new SortFruitsByColor());
        Arrays.sort(fruits, (first, last) -> (int) ((first.getColor().ordinal() - last.getColor().ordinal())*100 +
                (first.getWeight() - last.getWeight())));
        System.out.println(Arrays.toString(fruits));





        int num = 6;
        String str = switch (num) {
            case 1, 3, 5 -> "1";
            case 2 -> "2";
            default -> "0";
        };


    }
}