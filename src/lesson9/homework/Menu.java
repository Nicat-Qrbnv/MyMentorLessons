package lesson9.homework;

class Menu {
    private Kabab kabab;
    private Meze meze;
    private Ichki ichki;

    public Menu(Kabab kabab, Meze meze, Ichki ichki) {
        this.kabab = kabab;
        this.ichki = ichki;
        this.meze = meze;
    }

    public double calculateTotalPrice() {
        return kabab.getPrice() + meze.getPrice() + ichki.getPrice();
    }

    @Override
    public String toString() {
        return "Menu:\n" + kabab + "\n" + meze + "\n" + ichki + "\n" + "Total: " + calculateTotalPrice() + " AZN";
    }
}