class Solution {
    static Long dyckPaths(int N) {
       long[] dp = new long[N+1];
       dp[0]=dp[1]=1l;
       for(int i=2; i<=N; i++){
           for(int j=0; j<i; j++){
               if(i-j-1>=0)
               dp[i] += dp[j]*dp[i-j-1];
           }
       }
        return dp[N-1];
    }
};
