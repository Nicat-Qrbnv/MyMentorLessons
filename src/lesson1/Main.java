package lesson1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Salam dünya mesajının çapı:
//        System.out.println("Hello World");
//        int num = 2_139_999_999;
//        long longNum = 5_234_567_890_123_456_789L;
//        double dbl = 2.56_782_359;
//        char ch = 'a';
//        String str = "565465";
//        boolean bl = true;

        int a = 13;
        int b = 5;

        int cem = a + b;
        int cx = a - b;
        int vr = a * b;
        int blm = a / b;
        int qlq = a % b;

        System.out.println("Cəm : " + cem);
        System.out.println("Çıxma : " + cx);
        System.out.println("Vurma: " + vr);
        System.out.println("Bölmə : " + blm);
        System.out.println("Qalıq : " + qlq);

        Scanner scanner = new Scanner(System.in);
        System.out.println("İnçlə bir dəyər daxil et: ");
        double inch = scanner.nextDouble();
        double cm = inch * 2.54;

        System.out.println(cm);
    }
}
