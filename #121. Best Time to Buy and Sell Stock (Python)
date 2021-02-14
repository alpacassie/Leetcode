# 121. Best Time to Buy and Sell Stock
# Python
class Solution(object):
    def maxProfit(self, prices:List[int]) -> int:
        # goal: buy at the minimum price, sell at the maximum price
        min_price = float('inf')
        max_profit = 0
        for p in prices:
            min_price = min(min_price, p)
            max_profit = max(max_profit, p - min_price)
    return max_profit
          
