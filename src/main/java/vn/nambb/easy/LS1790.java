package vn.nambb.easy;

import java.util.ArrayList;
import java.util.List;

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

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < c1.length; i++) {
            if (c1[i] != c2[i]) {
                list.add(i);
            }
        }

        if (list.size() == 2 && (c1[list.get(0)] == c2[list.get(1)]) && c1[list.get(1)] == c2[list.get(0)]) {
            return true;
        } else
            return list.isEmpty();
    }
}
