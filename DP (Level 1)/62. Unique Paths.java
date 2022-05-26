class Solution {
    public int memo(int row, int col, int[][]dp){
        if(row==dp.length || col==dp[0].length) return 0;
        if(row==dp.length-1 && col==dp[0].length-1){
            return 1;
        }
        if(dp[row][col]!=-1) return dp[row][col];
        int R= memo(row, col+1, dp);
        int D= memo(row+1, col, dp);
        
        return dp[row][col] = R+D;
    }
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                dp[i][j]= -1;
            }
        }
        return memo(0, 0, dp);
    }
}
