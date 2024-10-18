package vn.nambb.easy;

public class LS242 {

    public static void main(String[] args) {
        LS242 ls242 = new LS242();
        System.out.println(ls242.isAnagram("rat", "car"));
    }

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] count = new int[26];
        for (int i = 0; i < t.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }
        for (int j : count) {
            if (j != 0) {
                return false;
            }
        }

        return true;
    }
}
