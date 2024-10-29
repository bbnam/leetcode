package vn.nambb.medium;

import java.util.Arrays;

public class LS238 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        LS238 ls238 = new LS238();
        System.out.println(Arrays.toString(ls238.productExceptSelf(nums)));
    }

    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];

        result[0] = 1;
        for (int i = 1; i <= nums.length - 1; i++) {
            result[i] = result[i - 1] * nums[i - 1];
        }

        int postfix = 1;
        for (int i = nums.length - 1; i > 0; i--) {
            result[i] *= postfix;
            postfix = postfix * nums[i];
        }


        return result;
    }
}
