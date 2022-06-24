package leetcode.leetcode75one;

public class BestTimeToBuyAndSellStock {
    //Greedy

    public static void main(String[] args) {
        int[] prices = {2, 1, 4};

        int res = maxProfit(prices);

        System.out.println(res);

    }

    public static int maxProfit(int[] prices) {
        // find max where ascending

        int maxProfit = 0;
        int minPrice = prices[0];
        for(int i=1; i<prices.length; i++) {
            maxProfit = Math.max(maxProfit, prices[i]-minPrice);
            minPrice = Math.min(minPrice, prices[i]);
        }

        return maxProfit;
    }
}