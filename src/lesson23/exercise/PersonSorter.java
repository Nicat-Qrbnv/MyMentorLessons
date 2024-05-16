package lesson23.exercise;

import java.util.Comparator;

public class PersonSorter implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
        int nameDif = p1.getName().compareTo(p2.getName());
        int ageDif = p1.getAge() - p2.getAge();
        return nameDif != 0 ? nameDif : ageDif;
    }
}
