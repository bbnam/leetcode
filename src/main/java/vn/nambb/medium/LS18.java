package vn.nambb.medium;

import java.util.*;

public class LS18 {

    public static void main(String[] args) {
        int[] nums = {1000000000, 1000000000, 1000000000, 1000000000};
        int target = -294967296;
        LS18 ls = new LS18();
        System.out.println(ls.fourSum(nums, target));
    }

    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        Set<List<Integer>> set = new HashSet<>();
        if (target < 0 && nums[0] > 0) {
            return new ArrayList<>();
        }
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int left = j + 1;
                int right = nums.length - 1;
                while (left < right) {
                    long sum = nums[i] + nums[j] + nums[left] + nums[right];
                    if (sum == target) {
                        set.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
                        right--;
                    }
                    if (sum < target) {
                        left++;
                    }
                    if (sum > target) {
                        right--;
                    }
                }
            }
        }
        return set.stream().toList();
    }

}
