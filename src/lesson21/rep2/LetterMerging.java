package lesson21.rep2;
import java.util.LinkedList;

public class LetterMerging {

    public static void main(String[] args) {
        LinkedList<Character> lowercaseLetters = generateLetters(false);
        LinkedList<Character> uppercaseLetters = generateLetters(true);

        LinkedList<String> mergedLetters = mergeLists(lowercaseLetters, uppercaseLetters);

        System.out.println("Merged List of English Letters:");
        for (String letter : mergedLetters) {

            System.out.print(letter + ", ");
        }
    }

    private static LinkedList<Character> generateLetters(boolean upper) {
        LinkedList<Character> lowercaseLetters = new LinkedList<>();
        char c = upper ? 'A' : 'a';
        for (; c <= 'z'; c++) {
            lowercaseLetters.add(c);
        }
        return lowercaseLetters;
    }

    private static LinkedList<String> mergeLists(LinkedList<Character> lowers, LinkedList<Character> uppers) {
        LinkedList<String> mergedList = new LinkedList<>();
        while (!lowers.isEmpty()){
            mergedList.add(lowers.poll() + "" + uppers.poll());
        }
        return mergedList;
    }
}