package lesson20;

public class Lunch <T extends Edible> {
    public void eat (T food) {
        System.out.println(food.getName());
    }
}
