//Memoisation


class Solution{
    public int mod =1000000007;
    
   public long memo(int n, long[]dp){
   if(n==0 || n==1) return 1l;
    
   if(dp[n]!=-1) return dp[n];
    
    long single= memo(n-1,dp);
    long pair= (memo(n-2, dp)*(n-1))%mod;
    
    return dp[n] =(single+pair) %mod;
}
    public long countFriendsPairings(int n) 
    { long[] dp= new long[n+1];
      
      Arrays.fill(dp, -1);
      return memo(n, dp);
       
    }
}    
 
