class Solution {
    public int helper(List<List<Integer>> triangle, int row, int col, Integer[][] dp){
       if(row== triangle.size()-1){
           //entire row is the destination
           return triangle.get(row).get(col);
       } 
       if(dp[row][col]!=null) return dp[row][col];
       
       int call1= helper(triangle, row+1, col, dp);
       int call2= helper(triangle, row+1, col+1, dp);
        
       return dp[row][col]= Math.min(call1, call2)+ triangle.get(row).get(col);
    }
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        Integer[][] dp  = new Integer[n+1][n+1];
        return helper(triangle, 0, 0, dp);
    }
}
