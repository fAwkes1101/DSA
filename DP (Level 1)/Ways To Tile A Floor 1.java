//Fibonnaci 2 pointer code taking 1st fibo as 1 and 2nd as 2 and so on.
class Solution {
    static int mod =1000000007;
    static int twoPointer(int n){
        int prev2=1;
        int prev1=2;
        
        for(int i=3; i<=n; i++){
            int curr =(prev1+prev2)%mod;
            prev2=prev1;
            prev1=curr;
           // System.out.println(prev1);
        }
        return prev1;
        
    }
    static int numberOfWays(int N) {
        if(N==1 || N==2) return N;
        
        return twoPointer(N);
    }
};
