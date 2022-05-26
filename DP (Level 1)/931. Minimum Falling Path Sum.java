class Solution {
      public int memo(int[][] grid,int i, int j, int[][] dp){
        if(j<0 || j== grid[0].length){
            return Integer.MAX_VALUE;
        }
          if(i==grid.length-1){
            return grid[i][j];
        }
        
        if(dp[i][j]!=-1) return dp[i][j];
        
        int RD= memo(grid, i+1, j+1, dp);
        int LD= memo(grid, i+1, j-1, dp);
        int D = memo(grid, i+1, j, dp);  
        
        return dp[i][j]= Math.min(D, Math.min(RD, LD))+grid[i][j];
    }
    public int minFallingPathSum(int[][] grid) {
        int n = grid.length; int m= grid[0].length;
        int[][] dp = new int[n+1][m+1];
        for(int i=0; i<=n; i++){
            for(int j=0; j<=m; j++){
                dp[i][j]= -1;
            }
        }
        int ans= Integer.MAX_VALUE;
        for(int j=0; j<grid[0].length; j++){
            ans = Math.min(ans, memo(grid, 0, j, dp));
        }
        
        return ans;
    }
}
