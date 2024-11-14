package vn.nambb.medium;

import java.util.Arrays;

public class LS2064 {
    public static void main(String[] args) {
        int[] quantities = {1};
        int n = 1;
        LS2064 ls2064 = new LS2064();
        System.out.println(ls2064.minimizedMaximum(n, quantities));
    }

    public int minimizedMaximum(int n, int[] quantities) {
        int low = 1;
        int high = Arrays.stream(quantities).max().getAsInt();
        while (low <= high) {
            int mid = (low + high) / 2;
            int stores = 0;
            for (int quan : quantities) {
                stores += (quan + mid - 1 / mid);
                if (quan % mid != 0) {
                    stores += 1;
                }
            }
            if (stores <= n) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

}
