
class Solution{
    public int memo(int n, int[] dp){
        if(n==1) return 0;

        if(dp[n]!=-1) return dp[n];
        
        int by2=Integer.MAX_VALUE, by3=Integer.MAX_VALUE, m1=Integer.MAX_VALUE;
        if(n%2==0) 
             by2= memo(n/2, dp);
        if(n%3==0)
             by3= memo(n/3, dp);
             
        m1= memo(n-1, dp);
             
        return dp[n] = Math.min(by2,Math.min( by3, m1)) +1;
    }

	public int minSteps(int N) 
	{ 
	   int[] dp = new int[N+1];
	   Arrays.fill(dp,-1);
	   
	   return memo(N,dp);
	} 
}
