package vn.nambb.medium;

public class LS424 {
    public static void main(String[] args) {
        String s = "ABAB";
        int k = 2;
        LS424 ls424 = new LS424();
        System.out.println(ls424.characterReplacement(s, k));
    }
    // sliding window
    public int characterReplacement(String s, int k) {
        int maxCount = 0;
        int max = 0;
        int left = 0;
        int[] charArray = new int[26];
        for (int right = 0; right < s.length(); right++) {
            charArray[s.charAt(right) - 'A']++;
            maxCount = Math.max(maxCount, charArray[s.charAt(right) - 'A']);
            while (right - left + 1 - maxCount > k) {
                charArray[s.charAt(left) - 'A']--;
                left++;
            }
            max = Math.max(max, right - left + 1);
        }
        return max;
    }
}
