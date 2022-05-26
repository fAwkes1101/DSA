import java.io.*;
import java.util.*;

public class Main {

   //Tabulation: Time and Space O(n*m)
   public static int[][] minPathSum(int[][] grid) {
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
       return dp;
    }
     public static void DFS(int row, int col, int[][]grid, int[][]dp, String psf){
       if(row== grid.length-1 && col== grid[0].length-1){
          System.out.println(psf);
          return;
       }
       int minVal= Math.min(dp[row+1][col], dp[row][col+1]);
        if(dp[row+1][col]==minVal){
           DFS(row+1, col, grid, dp, psf+"V");
        }

        if(dp[row][col+1]==minVal){
            DFS(row, col+1, grid, dp, psf+"H");
        }
   }

   public static void main(String[] args) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int n = Integer.parseInt(br.readLine());
      int m = Integer.parseInt(br.readLine());
      int[][] arr = new int[n][m];

      for (int i = 0; i < n; i++) {
         String str = br.readLine();
         for (int j = 0; j < m; j++) {
            arr[i][j] = Integer.parseInt(str.split(" ")[j]);
         }
      }

      int[][]dp = minPathSum(arr);
      System.out.println(dp[0][0]);

      DFS(0, 0, arr, dp, "");
   }
  

}
