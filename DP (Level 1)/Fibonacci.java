//Most optimised two pointer 
public int fib(int n) {
        //most optimised
        if(n<=1) return n;
        int prev2=0;
        int prev1=1;
        for(int i=2 ;i<=n ;i++){
           int curr = prev1+prev2;
            prev2=prev1;
            prev1=curr;
           
        }
        return prev1;
        
    }

// Tabulation
public int fib(int n) {
        if(n<=1) return n;
        int[] dp =new int[n+1];
        dp[0]=0;
        dp[1]=1;
        for(int i=2 ;i<=n ;i++){
            dp[i]= dp[i-1]+dp[i-2];
        }
        return dp[n];
        
    }

//Memoisation
class Solution {
    public int fibCalc(int n, int[] dp) {
        if(n==0||n==1) return n;
        
        if(dp[n]!=-1){
            return dp[n];
        }
        int prev1= fib(n-1);
        int prev2 = fib(n-2);
        
        dp[n]=prev1+prev2;
        return prev1+prev2;
        
    }
    public int fib(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        return fibCalc(n,dp);
    }
}

//Recursive
 public int fib(int n) {
        if(n==0||n==1) return n;
        
        int prev1= fib(n-1);
        int prev2 = fib(n-2);
        
        return prev1+prev2;
        
    }
