package lesson13.homeWork;

public class CPU extends Product {

    private int cores;
    private double clockSpeed;

    public CPU(String brand, String model, int cores, double clockSpeed) {
        super(brand, model);
        this.cores = cores;
        this.clockSpeed = clockSpeed;
    }

    public void process() {
        System.out.println(getInfo() + " is processing data with " + cores + " cores at " + clockSpeed + " GHz.");
    }
}
