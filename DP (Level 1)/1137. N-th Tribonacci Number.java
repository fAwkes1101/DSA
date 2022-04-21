class Solution {
    
   //Memoisation
//     public int calc(int n, int[] dp){
//         if(n==0) return 0;
//         if(n==1||n==2) return 1;
        
//         if(dp[n]!=-1) return dp[n];
//        int prev1= calc(n-1,dp);
//        int prev2= calc(n-2,dp);
//        int prev3= calc(n-3,dp);
       
//        dp[n]= prev1+prev2+prev3;
//         return prev1+prev2+prev3;
        
//     }
// Tabulation
    public int tribonacci(int n) {
      if(n==0) return 0;
        if(n==1||n==2) return 1;
      int[] dp = new int[n+1];
      dp[0]=0; dp[1]=1; dp[2]=1;
        
        //nth index of dp means tribo of nth
        for(int i=3;i<n+1; i++){
            dp[i]=dp[i-1]+dp[i-2]+dp[i-3];
        }
        return dp[n];
    }
}
