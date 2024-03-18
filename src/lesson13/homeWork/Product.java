package lesson13.homeWork;

public class Product {

    private final String brand;
    private final String model;

    public Product(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public final String getInfo() {
        return this.getClass().getSimpleName() + " : " + brand + " " + model;
    }
}
