package lesson10;

public class Main {
    public static void main(String[] args) {

        String str1 = "Hello";

        String str2 = "Hello";

        String str3 = new String(str1);

        str3 = new String("hello");

        System.out.println(str1 == str3);
    }
}
