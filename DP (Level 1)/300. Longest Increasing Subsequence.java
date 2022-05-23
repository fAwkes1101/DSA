//N*N time and space
class Solution {
    public int memo(int index, int prev, int[]nums, int[][] dp){
        if(index==nums.length) return 0;
        
        if(dp[index][prev+1]!=-1) return dp[index][prev+1];
        int yes = (prev==-1 || nums[prev]<nums[index]) ? memo(index+1, index, nums, dp)+1: 0;
        int no  = memo(index+1, prev, nums, dp);
        
         return dp[index][prev+1] = Math.max(yes, no);
            
        }
    public int lengthOfLIS(int[] nums) {
        int[][] dp = new int[nums.length+1][nums.length+1];
        for(int i=0; i<nums.length; i++){
            for(int j=0; j<nums.length; j++){
                dp[i][j]=-1;
            }
            
        }
        return memo(0, -1, nums, dp);
    }
}
