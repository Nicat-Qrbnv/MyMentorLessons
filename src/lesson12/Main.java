package lesson12;

import lesson13.Animal;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person( "Sefa", 124);
        Person p2 = new Person( "Inal", 124);

        System.out.println(p1.equals(p2));
    }
}