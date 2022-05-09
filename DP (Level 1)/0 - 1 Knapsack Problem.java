// Memoisation TC- O(capacity*items), SC- O(capacity*items)
class Solution 
{   
    static int memo(int capacity,int index, int wt[], int cost[], int[][]dp){
        if(index == cost.length) return 0;
        if(dp[capacity][index] != -1) return dp[capacity][index];
        
        int no = memo(capacity, index+1, wt, cost, dp);
        int yes = (capacity>=wt[index]) ?
                            memo(capacity- wt[index], index+1, wt, cost, dp) + cost[index]
                                                                                    : -1;
                        
        return dp[capacity][index] = Math.max(no, yes);                  
    }
    //Function to return max value that can be put in knapsack of capacity W.
    static int knapSack(int capacity, int wt[], int cost[], int items) 
    { 
         int[][] dp= new int[capacity+1][cost.length]; 
         for(int i=0; i<capacity+1; i++){
             for(int j=0; j<cost.length; j++){
                 dp[i][j]=-1;
             }
         }
         return memo(capacity, 0, wt, cost, dp);
    } 
}

//Tabulation   
// Time - O(Capacity * Items), Space - O(Capacity * Items) 2d DP
static int knapSack(int capacity, int wt[], int cost[], int items) 
    { 
         int[][] dp= new int[capacity+1][cost.length+1]; 
        //  for(int i=0; i<capacity+1; i++){
        //      for(int j=0; j<cost.length; j++){
        //          dp[i][j]=-1;
        //      }
        //  }
         //return memo(capacity, 0, wt, cost, dp);
         
         for(int item=1; item<= cost.length; item++){
           for(int cap=1; cap<=capacity; cap++){
             
             int no = dp[cap][item-1];
             int yes = (cap>=wt[item-1]) ? cost[item-1] + dp[cap - wt[item-1]][item-1]
                                              : -1;
             dp[cap][item]= Math.max(no, yes);
           }
         }
         return dp[capacity][cost.length];
    } 
}

//Space Optimisation
// Time - O(Capacity * Items), Space - O(Capacity) 1D DP
static int knapSack(int capacity, int wt[], int cost[], int items) 
    { 
         int[] dp= new int[capacity+1]; 
       
         for(int item=1; item<= cost.length; item++){
           int newDp[]= new int[capacity+1];
           for(int cap=1; cap<=capacity; cap++){
             
             int no = dp[cap];
             int yes = (cap>=wt[item-1]) ? dp[cap-wt[item-1]]+cost[item-1] : -1;
             newDp[cap]= Math.max(no, yes);
           }
           dp = newDp;
         }
         return dp[capacity];
    } 


