package lesson16;

public class Person {
    private final String name;

    public Person(String name) {
        this.name = name;
    }

    public final void getDetails () {
        System.out.println(name);
    }
}
