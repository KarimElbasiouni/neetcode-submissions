class Solution {
    public int maxProfit(int[] prices) {
        
        int profit = 0;
        int buy = 0;
        int sell = 1;
        int maxProfit = 0;
        while(buy<prices.length && sell<prices.length){
            profit = prices[sell]-prices[buy];

            if (profit<0){
                buy = sell;
                sell++;
                continue;
            }
            
            maxProfit = Math.max(maxProfit, profit);
            sell++;
        }

        return maxProfit;
    }
}
