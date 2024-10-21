package vn.nambb.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LS1 {

    public static void main(String[] args) {
        int[] nums = {3, 3};
        int target = 6;
        LS1 ls1 = new LS1();
        System.out.println(Arrays.toString(ls1.twoSum(nums, target)));
    }


    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> maps = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            maps.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            if (maps.containsKey(target - nums[i]) && i != maps.get(target - nums[i])) {
                return new int[]{i, maps.get(target - nums[i])};
            }
        }

        return null;
    }
}
