
class Solution{
    static String backtrack(int l, int r, int[]nums, int[][]dp){
        if(l==r) return ""+(char)('A' + l);
        
        for(int k=l; k<r; k++){
            int cost= dp[l][k] + nums[l] * nums[k+1] * nums[r+1] + dp[k+1][r];
            if(cost==dp[l][r]){
                return '(' + backtrack(l, k, nums, dp)+ backtrack(k+1, r, nums, dp) +')';
            }
        }
        return "";
    }
    static String matrixChainOrder(int nums[], int N){
        int[][] dp = new int[N-1][N-1];
    
        for(int gap =1; gap<dp.length; gap++){
            for(int l=0,r=gap; r<dp.length; l++,r++){
                int minCost= Integer.MAX_VALUE;
                
                for(int k=l; k<r; k++){
                    int left = dp[l][k];
                    int right = dp[k+1][r];
                    
                    int cost = left + nums[l]*nums[k+1]*nums[r+1] + right;
                    minCost = Math.min(cost, minCost);
                }
                dp[l][r] = minCost;
                
            }
        }
        return backtrack(0, N-2, nums, dp);
    }
}
