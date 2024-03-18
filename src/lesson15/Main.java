package lesson15;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog("Border Collie", 12, "white");
        Fish fish = new Fish(1, "Golden");

        fish.move();

        dog.move();
    }
}
