class Solution {
    public int maxProfit(int[] prices) {
       int days = prices.length;
        int profit = 0; // cannot go negative

        int left = 0;
        int right = 1;

        while (right < days) {
            if (prices[left] < prices[right]) {
                profit = Math.max(profit, prices[right] - prices[left]);
            } else {
                left = right;
            }
            right++;
        }

        return profit;
    }
}
