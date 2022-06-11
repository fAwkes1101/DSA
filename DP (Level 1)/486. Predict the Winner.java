//Approach  1, considering calls for only A
class Solution {
    public int helper(int left, int right, int[]nums, int[][]dp){
        if(left>right) return 0;
        if(left==right) return nums[left];
        if(dp[left][right]!=-1) return dp[left][right];
        
        int c1= helper(left+2, right, nums, dp);
        int c2= helper(left+1, right-1, nums, dp);
        int c3= helper(left, right-2, nums, dp);
        
        return dp[left][right]= Math.max(nums[left]+ Math.min(c1,c2), nums[right]+ Math.min(c2,c3));
        
    }
    public boolean PredictTheWinner(int[] nums) {
        int[][] dp = new int[nums.length+1][nums.length+1];
        for(int i=0; i<dp.length; i++){
            for(int j=0; j<dp.length; j++){
                dp[i][j]=-1;
            }
        }
        int Ascore= helper(0, nums.length-1, nums, dp);
        
        int total=0;
        for(int i=0; i<nums.length; i++){
            total= total + nums[i];
        }
        int Bscore = total-Ascore;
        if(Ascore>=Bscore) return true;
            return false;
    }
}

//Return difference from each node

class Solution {
    public int helper(int left, int right, int[]nums, int[][]dp){
        if(left>right) return 0;
        if(left==right) return nums[left];
        if(dp[left][right]!=-1) return dp[left][right];
   
        return dp[left][right]= Math.max(nums[left]-helper(left+1, right, nums, dp), nums[right]-helper(left,right-1, nums,dp));
        
    }
    public boolean PredictTheWinner(int[] nums) {
        int[][] dp = new int[nums.length+1][nums.length+1];
        for(int i=0; i<dp.length; i++){
            for(int j=0; j<dp.length; j++){
                dp[i][j]=-1;
            }
        }
        int diff= helper(0, nums.length-1, nums, dp);
        if(diff>=0) return true;
        return false;
    }
}
