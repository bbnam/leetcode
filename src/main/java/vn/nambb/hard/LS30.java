package vn.nambb.hard;

import java.util.*;

public class LS30 {
    public static void main(String[] args) {
        String s = "lingmindraboofooowingdingbarrwingmonkeypoundcake";
        String[] words = {"fooo","barr","wing","ding","wing"};
        LS30 ls30 = new LS30();
        List<Integer> result = ls30.findSubstring(s, words);
        System.out.println(result); // Output: [0, 9]
    }

    public List<Integer> findSubstring(String s, String[] words) {

        int wordLength = words[0].length();
        int totalWordsLength = words.length * wordLength;
        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        List<Integer> result = new ArrayList<>();

        Deque<String> deque = new ArrayDeque<>();

        for (int i = 0; i <= s.length() - wordLength; i += wordLength) {
            String currentWord = s.substring(i, i + wordLength);
            deque.offerLast(currentWord);

            if (!wordCount.containsKey(currentWord)) {
                deque.pollLast();
                for (int j = 0; j <= deque.size(); j++) {
                    String removedWord = deque.pollFirst();
                    wordCount.put(removedWord, wordCount.get(removedWord) + 1);
                }
                continue;
            }

            wordCount.put(currentWord, wordCount.get(currentWord) - 1);


            if (deque.size() >= words.length) {
                if (isValid(deque, wordCount)) {
                    result.add(i - totalWordsLength + wordLength);
                }
                String removedWord = deque.pollFirst();
                wordCount.put(removedWord, wordCount.get(removedWord) + 1);
            }

        }

        return result;
    }

    public boolean isValid(Deque<String> deque, Map<String, Integer> wordCount) {
        for (String word : deque) {
            if (wordCount.get(word) != 0) {
                return false;
            }
        }
        return true;
    }
}
