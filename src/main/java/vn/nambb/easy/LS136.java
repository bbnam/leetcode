package vn.nambb.easy;

import java.util.HashSet;
import java.util.Set;

public class LS136 {
    public static void main(String[] args) {
        int[] nums = {2, 2, 1};
        LS136 ls136 = new LS136();
        System.out.println(ls136.singleNumber(nums));
    }

    public int singleNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                set.remove(num);
            } else {
                set.add(num);
            }
        }

        return set.iterator().next();
    }
}
