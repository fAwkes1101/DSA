//Time: O(n*m), Space: O(n*m)
class Solution {
    public int findLength(int[] s1, int[] s2) {
        int[][] dp = new int[s1.length+1][s2.length+1];
        
        int maxLength=0;
        for(int i= s1.length-1; i>=0; i--){
            for(int j=s2.length-1; j>=0; j--){
                if(s1[i] == s2[j]){
                   dp[i][j]= 1+ dp[i+1][j+1];
                }
                maxLength= Math.max(maxLength, dp[i][j]);
            }
        }
        return maxLength;
    }
}
