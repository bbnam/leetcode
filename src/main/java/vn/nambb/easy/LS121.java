package vn.nambb.easy;

public class LS121 {
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        LS121 ls121 = new LS121();
        System.out.println(ls121.maxProfit(prices));
    }

    public int maxProfit(int[] prices) {
        int max = 0;
        int minPrices = Integer.MAX_VALUE;
        for (int price : prices) {
            if (price < minPrices) {
                minPrices = price;
            }
            if (price - minPrices > max) {
                max = price - minPrices;
            }
        }

        return max;
    }
}
