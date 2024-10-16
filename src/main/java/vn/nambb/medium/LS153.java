package vn.nambb.medium;

public class LS153 {
    public static void main(String[] args) {
        int[] nums = {3, 1, 2};
        System.out.println(new LS153().findMin(nums));
    }

    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = (left + right) / 2;
            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return nums[left];
    }
}
