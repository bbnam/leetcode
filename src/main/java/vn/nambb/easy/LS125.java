package vn.nambb.easy;

public class LS125 {
    public static void main(String[] args) {
        String s = "race a car";
        LS125 ls125 = new LS125();
        System.out.println(ls125.isPalindrome(s));
    }

    public boolean isPalindrome(String s) {
        s = s.replaceAll("[\\p{Punct}]", "").toLowerCase().replace(" ", "");
        int left = 0;
        int right = s.length() - 1;
        while (left <= right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
