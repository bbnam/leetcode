package vn.nambb.medium;

import java.util.HashSet;
import java.util.Set;

public class LS3 {
    public static void main(String[] args) {
        String a = "pwwkew";
        LS3 ls3 = new LS3();
        System.out.println(ls3.lengthOfLongestSubstring(a));
    }

    public int lengthOfLongestSubstring(String s) {
        Set<Character> characters = new HashSet<>();
        int left = 0;
        int max = 0;
        for (int right = 0; right < s.length(); right++) {
            Character c = s.charAt(right);
            while (characters.contains(c)) {
                characters.remove(s.charAt(left));
                left += 1;
            }
            characters.add(c);
            max = Math.max(max, right - left + 1);
        }
        return max;
    }

}
