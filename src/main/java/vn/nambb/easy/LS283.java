package vn.nambb.easy;

import java.util.Arrays;

public class LS283 {
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        LS283 ls283 = new LS283();
        ls283.moveZeroes(nums);
    }

    public void moveZeroes(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i; j < nums.length; j++) {
                if (nums[i] == 0) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
    }
}
