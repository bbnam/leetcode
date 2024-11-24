package vn.nambb.easy;

import java.util.Arrays;

public class LS1652 {

    public static void main(String[] args) {
        int[] code = {2, 4, 9, 3};
        int k = -2;
        LS1652 solution = new LS1652();
        System.out.println(Arrays.toString(solution.decrypt(code, k))); // [12,5,6,13]
    }

    public int[] decrypt(int[] code, int k) {
        int[] res = new int[code.length];
        for (int left = 0; left < code.length; left++) {
            int right = left;
            int sum = 0;
            if (k == 0) {
                res[left] = 0;
            } else {
                while (Math.abs(right - left) < Math.abs(k)) {
                    if (k > 0) {
                        sum += code[(right + 1) % code.length];
                        right++;
                    } else {
                        if (right - 1 < 0) {
                            sum += code[-Math.abs(right - 1) + code.length];
                        } else {
                            sum += code[Math.abs(right - 1) % code.length];
                        }
                        right--;
                    }
                }
            }
            res[left] = sum;

        }
        return res;
    }
}
