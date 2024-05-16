package lesson23;

import lesson23.exercise.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        StringEditor editor = str -> str.toLowerCase();
        System.out.println(editor.apply("Hello"));
        Supplier<Integer> ran = () -> new Random().nextInt(0, 10);
        System.out.println(ran.get());
        System.out.println(ran.get());
        System.out.println(ran.get());

        Predicate<Integer> isEvenPredicate = n -> n % 2 == 0;
        var result = isEvenPredicate.test(10);
        System.out.println("Is 10 even? " + result);

        var str = new String[] {"aaa", "bb", "c"};
        var list = Arrays.stream(str).filter(s -> s.length() == 1).toList().stream();
        System.out.println(list);
        int[] ints = {1, 2, 3};
        Arrays.stream(ints).forEach(System.out::println);
        list.forEach(System.out::println);

        addProduct("a");
        addProduct("b", "c", "inal");

    }
    static List<String> strings = new ArrayList<>();
    public static void addProduct (String... strs) {
        strings.addAll(Arrays.asList(strs));
    }
}
