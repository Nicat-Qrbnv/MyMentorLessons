package lesson9.homework;

// Main class
public class Main {
    public static void main(String[] args) {

        Kabab kabab = new Kabab("lülə");
        Meze meze = new Meze("yaşıllıq");
        Ichki ichki = new Ichki("şirə");

        Menu menu = new Menu(kabab, meze, ichki);

        System.out.println(menu);
    }
}
