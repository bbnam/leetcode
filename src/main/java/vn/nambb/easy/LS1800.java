package vn.nambb.easy;

public class LS1800 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 5, 10, 50};
        LS1800 sol = new LS1800();
        System.out.println(sol.maxAscendingSum(arr));
    }

    public int maxAscendingSum(int[] nums) {
        int max = nums[0];
        int sum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] < nums[i]) {
                sum += nums[i];
            } else {
                sum = nums[i];
            }
            max = Math.max(max, sum);
        }
        return max;
    }
}
