class Solution {
    
    public boolean checkTargetSum(int[] nums, int target){
        int n = nums.length;
        
        boolean[] dp = new boolean[target+1];
        dp[0] = true;
        for(int i=1; i<=n; i++){
            boolean[] newdp = new boolean[target+1];
            for(int j=0 ;j<target+1; j++){
                boolean no = dp[j];
                boolean yes= (j>=nums[i-1]) ? dp[j- nums[i-1]] : false;
                
                newdp[j] = yes||no;
            }
            dp = newdp;
        }
        return dp[target];
    }
    public boolean canPartition(int[] nums) {
        int total = 0;
        for(int val: nums) total +=val;
        
        if(total%2 == 1) return false;
        return checkTargetSum(nums, total/2);
    }
}
