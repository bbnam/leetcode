package vn.nambb.easy;

import java.util.HashMap;
import java.util.Map;

public class LS219 {
    public static void main(String[] args) {
        int[] nums = {1, 0, 1, 1};
        int k = 1;
        LS219 ls219 = new LS219();
        System.out.println(ls219.containsNearbyDuplicate(nums, k));
    }

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> integerListMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (integerListMap.containsKey(nums[i])) {
                if (i - integerListMap.get(nums[i]) <= k) {
                    return true;
                }
            }
            integerListMap.put(nums[i], i);
        }
        System.gc();
        return false;
    }

}
