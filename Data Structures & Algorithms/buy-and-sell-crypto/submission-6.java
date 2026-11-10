class Solution {
    public int maxProfit(int[] prices) {
        
        int buy = 0;
        int sell = 1;
        int maxProfit = 0;
        while(buy<prices.length && sell<prices.length){
            int profit = prices[sell]-prices[buy];

            if (profit<0){
                buy = sell;
            }

            maxProfit = Math.max(maxProfit, profit);
            sell++;
        }

        return maxProfit;
    }
}
