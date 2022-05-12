//Considering each day as potential selling day, TC: O(n) SC: O(1)
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


//Considering each day as potential buying day, TC: O(n) SC: O(1)
 public int maxProfit(int[] prices) {
        int profit = 0;
        int buying = prices[0];
        
        for(int i=0 ; i<prices.length; i++){
            buying = Math.min(buying, prices[i]);
            int selling = prices[i];
            
            profit= Math.max(profit, selling-buying);
            
        }
        return profit;
    }
