package vn.nambb.medium;

import java.util.Arrays;

public class LS34 {
    public static void main(String[] args) {
        LS34 ls34 = new LS34();
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 7;
        System.out.println(Arrays.toString(ls34.searchRange(nums, target)));
    }

    public int[] searchRange(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int position = -1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                position = mid;
            }
            if (nums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        int first = -1;
        int last = -1;
        if (position != -1) {
            first = position;
            last = position;
            while (first >= 0 && nums[first] == target) {
                first--;
            }
            first += 1;

            while (last < nums.length && nums[last] == target) {
                last++;
            }
            last -= 1;
        }

        return new int[]{first, last};
    }
}
