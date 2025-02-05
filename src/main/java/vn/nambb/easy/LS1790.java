package vn.nambb.easy;

public class LS1790 {
    public static void main(String[] args) {
        String s1 = "npv";
        String s2 = "zpn";
        LS1790 l = new LS1790();
        System.out.println(l.areAlmostEqual(s1, s2));
    }

    public boolean areAlmostEqual(String s1, String s2) {
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();

        if (c1.length != c2.length) return false;

        int first = -1;
        int second = -1;
        for (int i = 0; i < c1.length; i++) {
            if (c1[i] != c2[i]) {
                if (first == -1) {
                    first = i;
                } else if (second == -1) {
                    second = i;
                } else {
                    return false;
                }
            }
        }

        if (first == -1 && second == -1) {
            return true;
        }

        if (second == -1) {
            return false;
        }

        return s1.charAt(first) == s2.charAt(second)
                && s1.charAt(second) == s2.charAt(first);

    }
}
