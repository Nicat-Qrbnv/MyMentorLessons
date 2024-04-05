package lesson20;

public class Apple implements Edible {
    private String name;

    public Apple(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
