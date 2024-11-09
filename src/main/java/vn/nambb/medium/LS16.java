package vn.nambb.medium;

import java.util.Arrays;

public class LS16 {
    public static void main(String[] args) {
        LS16 ls = new LS16();
        int[] nums = {4, 0, 5, -5, 3, 3, 0, -4, -5};
        int target = -2;
        System.out.println(ls.threeSumClosest(nums, target));
    }

    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int res = Integer.MAX_VALUE / 2;

        for (int i = 0; i < nums.length; i++) {
            int left = 0;
            int right = nums.length - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (Math.abs(sum - target) < Math.abs(res - target)) {
                    res = sum;
                }
                if (sum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return res;
    }

}
