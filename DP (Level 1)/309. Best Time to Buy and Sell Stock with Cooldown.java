//Tabulation O(N)Space, O(N)Time
public int maxProfit(int[] prices) {
        if(prices.length<=1) return 0;
        
        int[] buy = new int[prices.length];
        int[] sell = new int[prices.length];
        
        buy[0]= -prices[0];
        sell[0]= 0;
        buy[1]= Math.max(-prices[0], -prices[1]);
        sell[1]= Math.max(0, prices[1]-prices[0]);
        
        for(int i=2; i<prices.length; i++){
            buy[i]= Math.max(buy[i-1], sell[i-2]-prices[i]);
            sell[i]= Math.max(sell[i-1], buy[i-1]+ prices[i]);
            
        }
        return sell[prices.length-1];     
    }
    
    SpaceOptimisation O(1)Space, O(N)Time
       public int maxProfit(int[] prices) {
        if(prices.length<=1) return 0;
  
        int buy0= -prices[0];
        int sell0= 0;
        int buy1= Math.max(-prices[0], -prices[1]);
        int sell1= Math.max(0, prices[1]-prices[0]);
        
        for(int i=2; i<prices.length; i++){
            int newBuy= Math.max(buy1, sell0-prices[i]);
           int newSell = Math.max(sell1, buy1+ prices[i]);
            
            buy0 =buy1; sell0= sell1;
            buy1= newBuy; sell1= newSell;
            
        }
        return sell1;
        
      
