package vn.nambb.medium;

import java.util.Arrays;

public class LS875 {

    public static void main(String[] args) {
        int[] piles = {30, 11, 23, 4, 20};
        int h = 6;
        LS875 ls875 = new LS875();
        System.out.println(ls875.minEatingSpeed(piles, h));
    }


    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = Arrays.stream(piles).max().getAsInt();

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (isValid(piles, mid, h)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }


    public boolean isValid(int[] piles, int mid, int h) {
        int sum = 0;
        for (int pile : piles) {
            if (pile % mid == 0) {
                sum += pile / mid;
            } else {
                sum += pile / mid + 1;
            }
        }
        return sum <= h;
    }
}
