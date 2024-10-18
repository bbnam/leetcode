package vn.nambb.easy;

import java.util.HashSet;
import java.util.Set;

public class LS217 {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        System.out.println(new LS217().containsDuplicate(nums));
    }

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            }
            set.add(num);
        }
        return false;
    }
}
