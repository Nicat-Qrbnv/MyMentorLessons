package lesson13.homeWork;

public class Laptop extends Product {

    private final CPU cpu;
    private final GPU gpu;

    public Laptop(String brand, String model, CPU cpu, GPU gpu) {
        super(brand, model);
        this.cpu = cpu;
        this.gpu = gpu;
    }

    public void start() {
        System.out.println("Starting " + getInfo());
        cpu.process();
        gpu.render();
        System.out.println("Laptop started successfully.");
    }
}
