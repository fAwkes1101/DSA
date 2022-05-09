//Memosation TC: O(items*capacity), SC: O(items*capacity)
class Solution{
    static int memo(int index, int caps, int cost[], int wt[], int[][]dp){
       if(index== cost.length || caps==0) return 0;
       if(dp[caps][index]!=-1) return dp[caps][index];
       
       int no = memo(index+1, caps, cost, wt, dp);
       int yes = (caps>=wt[index]) ? cost[index]+ memo(index, caps-wt[index], cost, wt, dp):-1;   
       
       return dp[caps][index]=Math.max(yes, no);
    }
    static int knapSack(int N, int caps, int cost[], int wt[])
    { 
        int[][]dp = new int[caps+1][cost.length+1];
         for(int i=0; i<caps+1; i++){
             for(int j=0; j<cost.length+1; j++){
                 dp[i][j]=-1;
             }}
        return memo(0, caps, cost, wt, dp);      
    }
}
//Tabulation TC: O(items*capacity), SC: O(items*capacity)
static int knapSack(int N, int caps, int cost[], int wt[])
    { 
        int[][]dp = new int[caps+1][cost.length+1];
    
        for(int item = 1; item<=cost.length; item++){
            for(int cap=1; cap<=caps; cap++){
               int no= dp[cap][item-1];
               int yes= (cap>=wt[item-1]) ? cost[item-1] + dp[cap-wt[item-1]][item]: -1;
               dp[cap][item]= Math.max(no,yes);
            }
        }
        return dp[caps][N];
        
    }
//Space Optimisation TC: O(items*capacity), SC: O(capacity)
 static int knapSack(int N, int caps, int cost[], int wt[])
    { 
        int[]dp = new int[caps+1];
    
        for(int item = 1; item<=cost.length; item++){
            for(int cap=1; cap<=caps; cap++){
               int no= dp[cap];
               int yes= (cap>=wt[item-1]) ? cost[item-1] + dp[cap-wt[item-1]]: -1;
               dp[cap]= Math.max(no,yes);
            }
        }
        return dp[caps];
        
    }
