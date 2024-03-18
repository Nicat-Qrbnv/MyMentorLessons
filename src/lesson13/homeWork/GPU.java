package lesson13.homeWork;

public class GPU extends Product {

    private final int vRam;

    public GPU(String brand, String model, int vRam) {
        super(brand, model);
        this.vRam = vRam;
    }

    public void render() {
        System.out.println(getInfo() + " is rendering graphics with " + vRam + " GB of VRAM.");
    }
}
