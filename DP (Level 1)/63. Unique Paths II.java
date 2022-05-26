class Solution {
     public int memo(int row, int col, int[][]dp, int[][] grid){
        if(row == dp.length || col == dp[0].length || grid[row][col]==1) return 0;
        if(row==dp.length-1 && col==dp[0].length-1){
            return 1;
        }
        if(dp[row][col]!=-1) return dp[row][col];
       
        int R= memo(row, col+1, dp, grid);
        int D= memo(row+1, col, dp, grid);
        
        return dp[row][col] = R+D;
    }
    public int uniquePathsWithObstacles(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        
        if(grid[0][0]==1|| grid[m-1][n-1]==1) return 0;
        
        int[][] dp = new int[m][n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                dp[i][j]= -1;
            }
        }
        return memo(0, 0, dp, grid);
    }
}
