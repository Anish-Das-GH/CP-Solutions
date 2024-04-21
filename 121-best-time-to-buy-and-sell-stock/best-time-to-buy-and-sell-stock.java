class Solution {
    public int maxProfit(int[] prices) {
        int profit =0;
        int curr_profit =0;
        int buy_price = prices[0];
        int i;
        for(i=1;i<prices.length;i++)
        {
            if(prices[i]<buy_price)
            {
               buy_price = prices[i];
            }
            else
            {
                curr_profit = prices[i] - buy_price;
                profit = Math.max(profit,curr_profit);
            }
        }
        return profit;
    }
}