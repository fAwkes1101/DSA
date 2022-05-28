//Memoisation Time: O(N*M) Space: O(N*M)
class Solution {
    public int memo(String s1, String s2, int index1, int index2, int[][] dp){
        if(s1.length()==0 || s2.length()==0 || index1==s1.length() || index2==s2.length() ) return 0;
        
        if(dp[index1][index2]!=-1) return dp[index1][index2];
        int ans=0;
        char char1 = s1.charAt(index1);
        char char2 = s2.charAt(index2);
        if(char1 == char2 ){
             ans= 1+ memo(s1, s2, index1+1, index2+1, dp);
        }else{ 
            int ans1 = memo(s1, s2, index1+1, index2, dp);
            int ans2 = memo(s1, s2, index1, index2+1, dp);
            ans = Math.max(ans1, ans2);
        }
        return dp[index1][index2]= ans;
        
    }
    public int longestCommonSubsequence(String s1, String s2) {
        int[][]dp = new int[s1.length()][s2.length()];
        for(int i=0; i<s1.length(); i++){
            for(int j=0; j<s2.length(); j++){
                dp[i][j]=-1;
            }
        }
        
       return memo(s1, s2, 0, 0, dp);
    }
}

//Tabulation Time: O(N*M) Space: O(N*M)
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

//Space Optimisation: O(N), Time O(n*m)
    public int longestCommonSubsequence(String s1, String s2) {      
        int[] next = new int[s2.length() + 1];
        
        for(int i=s1.length()-1; i>=0; i--){
            int[] curr = new int[s2.length() + 1];
        
            for(int j=s2.length()-1; j>=0; j--){
                char ch1 = s1.charAt(i);
                char ch2 = s2.charAt(j);
                
                if(ch1 == ch2)
                    curr[j] = 1 + next[j + 1];
                
                else curr[j] = Math.max(next[j], curr[j + 1]);
            }
            
            next = curr;
        }
        
        return next[0];
    }
