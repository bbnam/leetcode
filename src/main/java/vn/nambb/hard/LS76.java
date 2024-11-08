package vn.nambb.hard;

public class LS76 {
    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";
        LS76 ls76 = new LS76();
        System.out.println(ls76.minWindow(s, t));
    }

    public String minWindow(String s, String t) {
        if (s.length() < t.length()) {
            return "";
        }

        int min = Integer.MAX_VALUE;

        for (int left = 0; left < s.length(); left++) {
            int countS = 0;
            int right = left;
            while (t.length() != countS && right != s.length()) {
                if (t.charAt(countS) == s.charAt(right)) {
                    countS++;
                }
                right++;
            }

            if (min > right - left + 1) {
                min = right - left + 1;
                System.out.println("right: " + right + " left: " + left);
            }
        }


        return "";
    }
}
