package vn.nambb.medium;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LS128 {
    public static void main(String[] args) {
        int[] nums = {1,0,-1};
        LS128 ls128 = new LS128();
        System.out.println(ls128.longestConsecutive(nums));
    }

    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        Set<Integer> integerSet = new HashSet<>();
        for (int num : nums) {
            integerSet.add(num);
        }
        if (nums.length == 0) return 0;
        int longest = 1;
        for (int i = 0; i <= nums.length - 1; i++) {
            int length = 0;
            System.out.println(nums[i]);
            while (integerSet.contains(nums[i] + length)) {
                length++;
            }
            longest = Math.max(longest, length);
            if (longest > (nums.length / 2)) break;
        }

        return longest;
    }
}
