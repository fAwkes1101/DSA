public class Solution {
    public int chordCnt(int A) {
        
        long[] dp = new long[A+1];
        if(A == 0) {
            return 0;
        }
        dp[0] = (long)1;
        
        if(A == 1) {
            return 1;
        }
        dp[1] = (long)1;
        
        if(A == 2) {
            return 2;
        }
        //dp[2] = (long)2;
        
        for(int i=2; i<=A; i++) {
            for(int j=0; j<i; j++) {
                dp[i] = (dp[i] + dp[j]*dp[i-j-1])%1000000007L;
            }
        }
        
        return (int)(dp[A]%1000000007L);
        
        
    }
}

