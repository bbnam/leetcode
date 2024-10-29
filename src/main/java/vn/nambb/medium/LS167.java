package vn.nambb.medium;

import java.util.Arrays;

public class LS167 {
    public static void main(String[] args) {
        int[] numbers = {2,3,4};
        int target = 6;
        LS167 ls167 = new LS167();
        System.out.println(Arrays.toString(ls167.twoSum(numbers, target)));
    }

    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        while (left <= right) {
            if (numbers[left] + numbers[right] == target) {
                return new int[]{left + 1, right + 1};
            }
            if (numbers[left] + numbers[right] > target) {
                right--;
            }
            if (numbers[left] + numbers[right] < target) {
                left++;
            }
        }
        return null;
    }
}
