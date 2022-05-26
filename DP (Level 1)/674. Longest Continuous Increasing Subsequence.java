class Solution {
    public int memo(int[][] grid,int i, int j, int[][] dp){
        if(i==grid.length-1 && j==grid[0].length-1){
            return grid[i][j];
        }
        if(i==grid.length || j== grid[0].length){
            return Integer.MAX_VALUE;
        }
        if(dp[i][j]!=-1) return dp[i][j];
        
        int right= memo(grid, i, j+1, dp);
        int down= memo(grid, i+1, j, dp);
        
        return dp[i][j]= Math.min(right,down)+grid[i][j];
    }
    public int minPathSum(int[][] grid) {
        int n = grid.length; int m= grid[0].length;
        int[][] dp = new int[n][m];
        for(int i=0; i<dp.length; i++){
            for(int j=0; j<dp[0].length; j++){
                dp[i][j]=-1;
            }
        }
        return memo(grid, 0, 0, dp);
    }
}
