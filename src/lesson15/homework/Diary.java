package lesson15.homework;

public class Diary implements Product {
    private String name;
    private double unitPrice;
    private int amount;

    public Diary(String name, double unitPrice, int amount) {
        this.name = name;
        this.unitPrice = unitPrice;
        this.amount = amount;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getUnitPrice() {
        return unitPrice;
    }

    @Override
    public double getAmount() {
        return amount;
    }

    @Override
    public double getCost () {
        return amount * unitPrice;
    }
}
