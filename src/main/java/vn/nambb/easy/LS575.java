package vn.nambb.easy;

import java.util.HashSet;

public class LS575 {
    public static void main(String[] args) {
        int[] candyType = {6, 6, 6, 6};
        LS575 l = new LS575();
        System.out.println(l.distributeCandies(candyType));

    }

    public int distributeCandies(int[] candyType) {
        HashSet<Integer> indices = new HashSet<>();
        for (int j : candyType) {
            indices.add(j);
        }
        return Math.min(candyType.length / 2, indices.size());
    }
}
