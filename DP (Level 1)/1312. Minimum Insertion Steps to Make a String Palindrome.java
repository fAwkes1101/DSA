class Solution {
    public int longestCommonSubsequence(String s1, String s2) {
        int[][]dp = new int[s1.length()+1][s2.length()+1];

        for(int i = s1.length()-1; i>=0; i--){
            for(int j = s2.length()-1; j>=0; j--){
                char char1 = s1.charAt(i);
                 char char2 = s2.charAt(j);
                if(char1==char2){
                    dp[i][j] = 1+ dp[i+1][j+1];
                }else{
                    dp[i][j] =  Math.max(dp[i+1][j], dp[i][j+1]);
                }
            }
        }
        return dp[0][0];

    }
    
 public int minInsertions(String s1) {
   String s2="";
        for(int i =s1.length()-1; i>=0; i--){
            char ch = s1.charAt(i);
            s2= s2+ ch ;
        }
        return s1.length() - longestCommonSubsequence(s1, s2);
     }
}
