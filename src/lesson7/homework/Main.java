package lesson7.homework;

public class Main {
    public static void main(String[] args) {
        System.out.println (canPack(2, 99, 7));
    }

    public static boolean canPack (int bigCount, int smallCount, int goal) {
        int sum = 5 * bigCount + smallCount; //11
        if (sum >= goal) { //11 > 7
            //artıq böyüklerin atılması
            if (5 * bigCount > goal) { //10 > 7
                while (5 * bigCount > goal) { //5 > 7
                    bigCount--;
                }
            }
            return (5 * bigCount + smallCount) >= goal; //5 + 1
        } else {
            return false;
        }
    }
}
