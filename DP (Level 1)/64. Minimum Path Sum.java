//Memoisation Time and space: O(n*m)
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

//Tabulation: Time and Space O(n*m)
   public int minPathSum(int[][] grid) {
        int n = grid.length; int m= grid[0].length;
        int[][] dp = new int[n+1][m+1];
        for(int i=0; i<=n; i++){
            for(int j=0; j<=m; j++){
                dp[i][j]= Integer.MAX_VALUE;
            }
        }
        
        for(int i= n-1; i>=0; i--){
            for(int j=m-1; j>=0; j--){
                if(i==n-1 && j==m-1){
                dp[i][j] = grid[i][j];
                continue;
                }
                dp[i][j]= Math.min(dp[i+1][j], dp[i][j+1]) + grid[i][j];
            }
        }
       return dp[0][0];
    }

// Spaceoptimisation possible using 1d dp
