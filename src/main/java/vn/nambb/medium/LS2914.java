package vn.nambb.medium;

public class LS2914 {
    public static void main(String[] args) {
        String s = "0000";
        LS2914 ls2914 = new LS2914();
        System.out.println(ls2914.minChanges(s));
    }

    public int minChanges(String s) {
        int count = 0;
        char[] chars = s.toCharArray();
        for (int i = 0; i < s.length() - 1; i = i + 2) {
            if (chars[i] != chars[i + 1]) {
                count++;
            }
        }
        return count;
    }
}
