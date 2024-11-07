package vn.nambb.easy;

import java.util.Arrays;

public class LS3131 {
    public static void main(String[] args) {
        int[] nums1 = {2, 6, 4};
        int[] nums2 = {9, 7, 5};
        LS3131 ls3131 = new LS3131();
        System.out.println(ls3131.addedInteger(nums1, nums2));
    }

    public int addedInteger(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        return nums2[0] - nums1[0];
    }
}
