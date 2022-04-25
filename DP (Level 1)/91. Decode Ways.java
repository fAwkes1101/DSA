//Memoisation
class Solution {
    
    public int Memo(String s, int idx, int[] dp){
        if(idx==s.length()) return 1;
        
        if(dp[idx]!=-1) return dp[idx];
        
        int ans1 = (s.charAt(idx)=='0')? 0: Memo(s, idx+1, dp);
        int ans2=0;
        if(idx+1<s.length())
        ans2 = (s.charAt(idx)=='0' || (s.charAt(idx)-'0')*10+(s.charAt(idx+1)-'0')>26)? 0: Memo(s, idx+2, dp);
        
        dp[idx]=ans1+ans2;
        return ans1+ans2;
    }
    public int numDecodings(String s) {
        int[] dp = new int[s.length()+1];
        Arrays.fill(dp, -1);
       return Memo(s, 0, dp);
    }
}
