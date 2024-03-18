package lesson13;

import lesson13.Animal;

public class Mammal extends Animal {
    public void method () {
        Animal a = new Animal();
        a.color = "white";
        this.legs = 4;
    }
}
