    class Solution {
    public int memo(int[] coins,  int amount, int[] dp){
        if(amount==0) return 1;
        if(amount<0) return 0;
        
        if(dp[amount]!=-1) return dp[amount];
        
        int total=0;
        for(int i=coins.length-1; i>=0; i--){
           total += memo(coins, amount-coins[i],dp);
        }
        
    
        return dp[amount]= total;
    }
        
    public int combinationSum4(int[] nums, int target) {
        int dp[] = new int[target+1];
        Arrays.fill(dp,-1);
        
         return memo(nums, target, dp);
    }
}
