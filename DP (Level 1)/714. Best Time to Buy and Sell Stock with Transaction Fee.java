//Tabulation TC: O(N) SC: O(N)
public int maxProfit(int[] prices, int fee) {
        int[] buy= new int[prices.length];
        int[] sell= new int[prices.length];
        buy[0] = -prices[0];
        sell[0]= 0;
        
        for(int i=1 ; i<prices.length; i++){
            int newBuy = Math.max(buy[i-1], sell[i-1]-prices[i]);
            int newSell = Math.max(sell[i-1], buy[i-1]+ prices[i]-fee);
            
            buy[i]= newBuy; sell[i]=newSell;
            
        }
        return sell[prices.length-1];
    }
    
//Space Optimisation TC: O(N) SC: O(1)
    public int maxProfit(int[] prices, int fee) {
        int buy= -prices[0];
        int sell=0;
        
        for(int i=0 ; i<prices.length; i++){
            int newBuy = Math.max(buy, sell-prices[i]);
            int newSell = Math.max(sell, buy+ prices[i]-fee);
            
            buy= newBuy; sell=newSell;
            
        }
        return sell;
    }
    
    
