package lesson21.rep2;

import java.util.*;

public class UniqueNumbers {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = generateRandomNumbers(100, 5, 10);

        System.out.println("Random Numbers:");
        System.out.println(numbers);

        Set<Integer> uniqueNumbers = getUniqueNumbers(numbers);

        System.out.println("\nUnique Numbers:");
        System.out.println(uniqueNumbers);
    }
    private static ArrayList<Integer> generateRandomNumbers(int count, int min, int max) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < count; i++) {
            int randomNumber = random.nextInt(min, max+1);
            numbers.add(randomNumber);
        }

        return numbers;
    }

    private static Set<Integer> getUniqueNumbers(ArrayList<Integer> numbers) {
        return new HashSet<>(numbers);
    }
}
