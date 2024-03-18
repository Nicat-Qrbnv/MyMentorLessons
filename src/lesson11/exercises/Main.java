package lesson11.exercises;

public class Main {
    public static void main(String[] args) {
        String str = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industrys standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged.";
        numberOfWords(str);
        charOccurrences(str, 'a');
    }

    public static int numberOfWords (String str) {
        String[] words = str.split(" ");
        int num = words.length;
        return num;
    }

    public static void charOccurrences (String text, char target) {
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == target) {
                count++;
            }
        }
        System.out.println("Number of occurences of %s in text: %d".formatted(target, count));
    }
}
