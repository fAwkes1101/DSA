class Solution
{
    public int LongestRepeatingSubsequence(String s)
    { int[][] dp = new int[s.length() + 1][s.length() + 1];
        
        for(int i=s.length()-1; i>=0; i--){
            for(int j=s.length()-1; j>=0; j--){
                char ch1 = s.charAt(i);
                char ch2 = s.charAt(j);
                
                if(ch1 == ch2 && i != j)
                    dp[i][j] = 1 + dp[i + 1][j + 1];
                
                else dp[i][j] = Math.max(dp[i + 1][j], dp[i][j + 1]);
            }
        }
        
       return dp[0][0];
        // code here
    }
}
