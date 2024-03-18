package lesson15.homework;

public class FreshProduce implements Product {
    private String name;
    private double unitPricePerKg;
    private double weight;

    public FreshProduce(String name, double unitPricePerKg, double weight) {
        this.name = name;
        this.unitPricePerKg = unitPricePerKg;
        this.weight = weight;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getUnitPrice() {
        return unitPricePerKg;
    }

    @Override
    public double getAmount() {
        return weight;
    }

    @Override
    public double getCost() {
        return unitPricePerKg * weight;
    }
}
