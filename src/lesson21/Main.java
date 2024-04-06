package lesson21;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String text = "This is a text1!";
        String ss = text.toLowerCase();

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < ss.length(); i++) {
            char c = ss.charAt(i);
            if (Character.isLetter(c)) {
                map.put(c, map.getOrDefault(c, 0) + 1);
            }
        }

        for (Map.Entry<Character, Integer> e : map.entrySet()) {
            System.out.println(e.getKey() + " : " + e.getValue());
        }
    }
}
