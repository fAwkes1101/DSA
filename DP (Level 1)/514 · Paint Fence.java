//1. Memoisation
public class Solution {
    
    public int memo(int n, int k, int[] dp){
        if(n==1) return k;
        if(n==2) return k*k;

        if(dp[n]!=-1) return dp[n];

        int ans= (memo(n-1, k, dp) + memo(n-2, k, dp))*(k-1);
        return dp[n] =ans;
    }
    public int numWays(int n, int k) {
        if(n==1) return k;
        if(n==2) return k*k;
        if(k==1) return 0;

        int[] dp =new int[n+1];
        Arrays.fill(dp, -1);
        return memo(n, k, dp);
    }
}

//Tabulation
public int numWays(int n, int k) {
        if(n==1) return k;
        if(n==2) return k*k;
        if(k==1) return 0;
  
        int[] same= new int[n+1];
        int[] diff= new int[n+1];
        same[2]=k; diff[2]= k*(k-1);

        for(int i=3; i<=n; i++){
            same[i]= diff[i-1];
            diff[i]= (same[i-1]+diff[i-1])*(k-1);
        }
        return same[n]+diff[n];
    }
