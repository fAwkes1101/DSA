class Solution {
    
    public int memo(int idx,int prev, int []nums, int [][]dp){
        if(idx==nums.length) return 0;
        if(dp[prev][idx]!= -1) return dp[prev][idx];
        
        int yes = (prev==0) ? memo(idx+1, 1, nums, dp)+nums[idx]: 0;
        int no = memo(idx+1, 0, nums, dp);
        
        return dp[prev][idx]=Math.max(yes, no);
    }
    public int rob(int[] nums) {
        int dp[][] = new int[2][nums.length+1];
        Arrays.fill(dp[0],-1);
        Arrays.fill(dp[1],-1);
       
        return memo(0, 0, nums,dp);
        
        
    }
}
