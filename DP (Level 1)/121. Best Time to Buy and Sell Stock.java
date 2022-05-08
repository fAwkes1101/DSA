class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int max = -1;
        
        for(int i=prices.length-1; i>=0; i--){
            if(max==-1) max= prices[i];
            profit = Math.max(profit, max-prices[i]);
            max = Math.max(max, prices[i]);
        }
        return profit;
    }
}
