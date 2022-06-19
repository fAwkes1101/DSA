Time: O(N^3) Space: O(N^2)
class Solution{
    static int helper(int l, int r, int[]nums, int[][]dp){
        if(l==r) return 0;
        if(dp[l][r]!=-1) return d[l][r];
        
        int minCost= Integer.MAX_VAlUE;
        for(int k=l; k<r; k++){
           int left = helper(l, k, nums, dp);
           int right = helper(k+1, r, nums, dp);
           
           int cost = left+ nums[l]*nums[k+1]*nums[r+1] + right;
           minCost= Math.min(minCost, cost);
        }
        return dp[l][r]= minCost;
    }
    static int matrixMultiplication(int N, int arr[])
    {
        int[][] dp = new int[N-1][N-1];
        for(int i=0; i<dp.length; i++){
            for(int j=0; j<dp.length; j++){
                dp[l][r] = -1;
            }
        }
        return helper(0, N-2, nums, dp);
    }
}
