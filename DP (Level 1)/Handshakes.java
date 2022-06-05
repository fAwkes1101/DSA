class Solution{
    static int count(int N) 
    { 
        int[] dp = new int[N+1];
        dp[0]=dp[1]=1;
        
        for(int i=2; i<=N/2; i++){
            for(int j=0; j<i; j++){
                if(i-j-1>=0){
                    dp[i] += dp[j]*dp[i-j-1];
                }
            }
        }
        return dp[N/2];
    }
};
