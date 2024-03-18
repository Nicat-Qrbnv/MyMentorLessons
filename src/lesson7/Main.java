package lesson7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Animal kengroo = new Animal("kengroo", "orange", 2, false);
        Animal cat = new Animal("cat", "black", false);

        System.out.println(kengroo.eat("grass"));

        cat.run();

        String catsColor = cat.getColor();
        System.out.println(catsColor);

        cat.setColor("white");
        System.out.println(cat.getColor());

        System.out.println(kengroo);
        System.out.println();
        System.out.println(cat);


        String str = "Hello";
        System.out.println(str.toUpperCase());

    }

}
