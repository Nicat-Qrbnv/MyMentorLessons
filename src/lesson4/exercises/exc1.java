package lesson4.exercises;

public class exc1 {
    public static void main(String[] args) {
        int count = 1;
        int sum = 0;

        while (count <= 10) {
            sum += count;
            count++;
        }

        System.out.println("Sum of the first 10 positive integers: " + sum);
    }
}
