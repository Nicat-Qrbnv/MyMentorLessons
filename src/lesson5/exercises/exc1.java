package lesson5.exercises;

public class exc1 {
    public static void main(String[] args) {
        int[] ranArr = new int[10];
        for (int i = 0; i < ranArr.length; i++) {
            ranArr[i] = (int) (Math.random()*100);
        }

        int sum = 0;
        for (int i : ranArr) {
            System.out.println(i);
            sum += i;
        }

        double average = (double) sum / ranArr.length;
        System.out.println("Average: " + average);
    }
}
