package lesson6.exercises;

public class exc2 {
    public static void main(String[] args) {
        int rows = 4;
        int columns = 10;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
