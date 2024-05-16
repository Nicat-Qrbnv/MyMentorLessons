package lesson23.exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Ccc", 15);
        Person p2 = new Person("Bbb", 30);
        Person p3 = new Person("Bbb", 19);
        Person p4 = new Person("Aaa", 23);

        List<Person> persons = new ArrayList<>(List.of(p1, p2, p3, p4));
        System.out.println(persons);
//        persons.sort(new PersonSorter());
        persons.sort((first, next) -> (first.getName().compareTo(next.getName()))*10 + Integer.compare(first.getAge(), next.getAge()));
        System.out.println(persons);

        BiFunction<Person, Person, Integer> sortByName = (first, next) -> first.getName().compareTo(next.getName());
        BiFunction<Person, Person, Integer> sortByAge = (first, next) -> first.getAge() - next.getAge();
        BiFunction<Person, Person, Integer> sortByBoth = (first, next) -> sortByName.apply(first, next) * 10 + sortByAge.apply(first, next);
        persons.sort(sortByBoth::apply);
    }
}
