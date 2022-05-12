//Tabulation TC: O(N) SC: O(N)
public int maxProfit(int[] prices) {
        int[] buy = new int[prices.length];
        int[] sell = new int[prices.length];
        buy[0]= -prices[0];
        sell[0]= 0;
        for(int i=1; i<prices.length; i++){
            buy[i]= Math.max(buy[i-1], sell[i-1]-prices[i]);
            sell[i]= Math.max(sell[i-1], buy[i-1]+ prices[i]);
            
        }
        return sell[prices.length-1];
        
    }

// Using Stack TC: O(N) SC: O(N)
    public int maxProfit(int[] prices) {
      Stack<Integer> stk = new Stack<>();
        
        int profit=0;
        for(int i=0; i<prices.length; i++){
            if(stk.size()>0 && stk.peek()<prices[i]){
                profit += prices[i]-stk.pop();  
            }
            stk.push(prices[i]);
        }
        return profit;
    }
// Space Optimisation in Stack TC: O(N) SC: O(1)
 public int maxProfit(int[] prices) {
        int buying = prices[0];
        int profit=0;
        for(int i=0; i<prices.length; i++){
            if(buying<prices[i]){
                profit += prices[i]-buying;  
            }
            buying= prices[i];
        }
        return profit;
    }
