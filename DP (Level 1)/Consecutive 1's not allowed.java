
//Memoisation
class Solution {
    int mod = 1000000000+7;
    long countRec(int length, int prevState, long[][]dp){
        if(length==0) return 1;
        
        if(dp[prevState][length]!=0) return dp[prevState][length];
        
        long ans1= countRec(length-1, 0,dp);
        long ans2= (prevState==1)? 0 : countRec(length-1, 1,dp);
        
        dp[prevState][length]=(ans1+ans2)%mod;
        return dp[prevState][length];
    }
    long countStrings(int n) {
          long[][] dp = new long[2][n+1];
          
          return countRec(n,0,dp);
    }
}

// Tabulation
// { Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());

            long ans = new Solution().countStrings(n);

            System.out.println(ans);
        }
    }
}// } Driver Code Ends


// User function Template for Java

class Solution {
    int mod = 1000000000+7;
    long countTabu(int n){
      long[][]dp = new long[2][n+1];
      dp[0][1]=1;
      dp[1][1]=1;
      for(int j=2; j<n+1; j++){
          
          for(int i=0; i<=1 ;i++){
              if(i==0) dp[i][j]= (dp[i][j-1]+dp[i+1][j-1])%mod;
              else{
                  dp[i][j]= dp[i-1][j-1]%mod;
              }
          }
      }
      return (dp[0][n]+dp[1][n])%mod;
    }
    
    long countStrings(int n) {
          return countTabu(n);
    }
}
