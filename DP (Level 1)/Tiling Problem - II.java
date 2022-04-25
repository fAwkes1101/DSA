//Memoisation O(N)-> time and space
class Solution
{   
    int mod = 1000000007;
    public int memo(int n, int m,int[]dp){
    if(n<m){
        return dp[n]=1;
    }
    if(n==m){
        return dp[n]=2;
    }
    if(dp[n]!=-1) return dp[n];
    
   int ans1= memo(n-1, m, dp);
   int ans2= memo(n-m, m, dp);
   
   return dp[n]=(ans1+ans2)%mod; 
}
    public int countWays(int n, int m)
    {   int[]dp = new int[n+1];
        Arrays.fill(dp,-1);
        return memo(n,m,dp);
    }
}

//Sliding Window Space Optimisation -> O(M) space

class Solution
{   int mod = 1000000007;
    public int countWays(int n, int m)
    {  if (n < m)
            return 1;
        if (n == m)
            return 2;
        
        Deque<Integer> dp = new ArrayDeque<>();
        for (int i = 1; i < m; i++) {
            dp.add(1); // DP[N < M]
        }
        dp.add(2); // DP[N == M]
       
       for(int i=m+1 ;i<=n; i++){
            int ans = (dp.getFirst() + dp.getLast()) % mod;
            dp.removeFirst();
            dp.addLast(ans);
       
       }
       return dp.getLast();
    }
}
