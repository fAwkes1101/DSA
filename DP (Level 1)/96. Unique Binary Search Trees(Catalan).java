//Memoisation Time: O(n*n), Space: O(n)
class Solution {
    public int catalan(int n){
    public int catalan(int n, int[] dp){
        if(n == 0 || n == 1) return 1;
        if(dp[n] != -1) return dp[n];

        int ans = 0;
        for(int i=0; i<n; i++){
            ans = ans + catalan(i) * catalan(n - 1 - i);
            ans = ans + catalan(i, dp) * catalan(n - 1 - i, dp);
        }
        return ans;

        return dp[n] = ans;
    }
    public int numTrees(int n) {
        return catalan(n);
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        return catalan(n, dp);
    }
}

//Tabulation Time: O(n*n), Space: O(n)
class Solution {
    public int numTrees(int n) {
        int[] dp = new int[n+1];
        dp[0]=1;
        dp[1]=1;
        for(int i=2; i< dp.length; i++){
            int ans=0;
            for(int j=0; j<=i; j++){
               if(i-1-j>=0)
                ans += dp[j] * dp[i-1-j];
            }
            dp[i]= ans;
        }
        return dp[n];
    }
}
