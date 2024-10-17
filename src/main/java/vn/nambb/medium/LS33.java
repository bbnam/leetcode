package vn.nambb.medium;

public class LS33 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6};
        int target = 4;
        System.out.println(search(nums, target));
    }

    public static int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        if (nums.length == 1 && nums[0] == target) {
            return 0;
        }

        while (left < right) {
            if (nums[left] == target) {
                return left;
            }
            if (nums[right] == target) {
                return right;
            }
            int mid = (left + right) / 2;
            System.out.println(mid);
            if (nums[mid] == target) return mid;
            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return -1;
    }
}
