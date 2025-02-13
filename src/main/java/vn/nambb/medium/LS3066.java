package vn.nambb.medium;

import java.util.PriorityQueue;

public class LS3066 {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 4, 9};
        int k = 20;
        LS3066 solution = new LS3066();
        System.out.println(solution.minOperations(nums, k));
    }

    public int minOperations(int[] nums, int k) {
        PriorityQueue<Long> pq = new PriorityQueue<>();
        for (int num : nums) {
            pq.add((long) num);
        }
        int op = 0;
        while (!pq.isEmpty()) {
            long x = pq.poll();
            if (x >= k) {
                break;
            }
            op++;
            long y = pq.poll();
            long z = Math.max(x, y) + Math.min(x, y) * 2;
            if (z < k) pq.add(z);
        }
        return op;
    }

}
