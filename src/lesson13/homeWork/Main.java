package lesson13.homeWork;

public class Main {

    public static void main(String[] args) {

        CPU cpu = new CPU("Intel", "i7-13700H", 14, 4.8);
        GPU gpu = new GPU("NVIDIA", "RTX 3070", 8);

        Laptop laptop = new Laptop("ASUS", "ROG Strix G15", cpu, gpu);

        laptop.start();
    }
}