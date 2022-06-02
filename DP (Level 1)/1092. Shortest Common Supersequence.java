class Solution {
    String scs="";
    public void DFS(int i, int j, String s1, String s2, int[][]dp, String ans){
        if(i==s1.length() && j==s2.length()){
            scs= ans;
            return;
        }
        char ch1 = (i<s1.length()) ? s1.charAt(i) : 'A';
        char ch2 = (j<s2.length()) ? s2.charAt(j) : 'B';
        
        if(ch1==ch2){
            DFS(i+1, j+1, s1, s2, dp, ans+ch1);
        }else{
            if(i+1 <= s1.length() && dp[i][j]==dp[i+1][j]){
            DFS(i+1, j, s1, s2, dp, ans+ch1);
            }
            else{
                DFS(i, j+1, s1, s2, dp, ans+ch2); 
            }
        }
    }
    public String shortestCommonSupersequence(String s1, String s2) {
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
        DFS(0 ,0 ,s1, s2, dp, "");
        return scs;
    }
}
