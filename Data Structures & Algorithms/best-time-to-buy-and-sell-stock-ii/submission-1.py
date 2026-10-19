class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        
        buy = 0
        sell = 1
        totalProfit = 0
        while buy<sell and sell < len(prices):
            profit = prices[sell] - prices[buy]
            if profit>0:
                totalProfit+=profit
            
            buy+=1
            sell+=1
        
        return totalProfit

            
