class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int minPrice = prices[0];
        for(int i=1;i<prices.length;i++) {
            int diff = prices[i] - minPrice;
            profit = diff > profit ? diff : profit;
            minPrice = prices[i] < minPrice ? prices[i] : minPrice;
        }
        return profit;
    }
}