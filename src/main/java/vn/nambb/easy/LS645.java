package vn.nambb.easy;

import java.util.Arrays;

public class LS645 {

    public static void main(String[] args) {
        int[] nums = {3, 2, 2};
        LS645 ls = new LS645();
        System.out.println(Arrays.toString(ls.findErrorNums(nums)));
    }

    public int[] findErrorNums(int[] nums) {
        int[] newArray = new int[nums.length];
        for (int num : nums) {
            newArray[num - 1]++;
        }
        int missing = 0;
        int repeat = 0;
        for (int i = 0; i < newArray.length; i++){
            if (newArray[i] == 0){
                missing = i + 1;
            }
            if (newArray[i] == 2){
                repeat = i + 1;
            }
        }

        return new int[]{repeat, missing};
    }
}
