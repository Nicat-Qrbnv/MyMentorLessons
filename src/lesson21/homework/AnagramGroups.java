package lesson21.homework;

import java.util.*;

public class AnagramGroups {
    public static void main(String[] args) {
        String[] words = {"eat", "tea", "tan", "ate", "nat", "bat"};
        Map<String, List<String>> result = groupAnagrams(words);

        for (Map.Entry<String, List<String>> entry : result.entrySet()) {
            System.out.println("Anagrams of " + entry.getKey() + ": " + entry.getValue() + ", Count: " + entry.getValue().size());
        }
    }

    public static Map<String, List<String>> groupAnagrams(String[] words) {
        Map<String, List<String>> map = new HashMap<>();

        for (String word : words) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sortedWord = new String(chars);

            if (!map.containsKey(sortedWord)) {
                map.put(sortedWord, new ArrayList<>());
            }

            map.get(sortedWord).add(word);
        }

        return map;
    }
}
