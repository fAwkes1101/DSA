class Solution {
    public int memo(int[] nums, int start, int end, int prev, int[][] dp){
        if(start==end+1) return 0;
        
        if(dp[prev][start]!=-1) return dp[prev][start];
        
        int yes = (prev==0) ? memo(nums, start+1, end, 1, dp)+ nums[start]: 0;
        int no = memo(nums, start+1, end, 0, dp);
        
        return dp[prev][start] =Math.max(yes, no);
    }
    public int rob(int[] nums, int start, int end){
        int n = nums.length;
        int dp[][] = new int[2][n+1];
        
        for(int j=0; j<n ;j++){
            dp[0][j]=-1;
            dp[1][j]=-1;
        }
        return memo(nums, start, end, 0, dp);
    }
    public int rob(int[] nums) {
        int n = nums.length;
        if(n==0) return 0;
        if(n==1) return nums[n-1];
        
        return Math.max(rob(nums, 0, n-2), rob(nums, 1, n-1));
    }
}
