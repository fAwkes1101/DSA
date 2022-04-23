//Memoisation
class Solution {
    public long memo(int n, int[] nums, int[] dp){
        if(n==nums.length-1){
            return 0; // min num of jumps to reach yourself
        }
        if(dp[n]!=Integer.MAX_VALUE){
            return dp[n];
        }
        long ans = Integer.MAX_VALUE;
        for(int i=1; i<=nums[n]; i++){
            if(i+n<nums.length){
                ans = Math.min(ans, memo(n+i,nums,dp)+1);
            }
        }
        dp[n]=(int)ans;
         return ans;   
    }
    
    public int jump(int[] nums) {
        int []dp = new int[nums.length+1];
        Arrays.fill(dp,Integer.MAX_VALUE);
        int ans = (int)memo(0, nums, dp);
        return ans;
    }
    
}

 
 //Tabulation
 public int Tabu(int[] jumps){
        int[] dp = new int[jumps.length];
        dp[dp.length-1]=0;
        
        for(int i=dp.length-2; i>=0;i--){
            int min= Integer.MAX_VALUE-10;
            for(int jump=1; jump<=jumps[i]; jump++){
                if(i+jump<=dp.length-1){
                   min= Math.min(dp[i+jump]+1,min);
                }
            }
            dp[i]=min;
        }
        return dp[0];
    }
    
    public int jump(int[] nums) {
        return Tabu(nums);
    }
    
    
}
