import java.io.*;
import java.util.*;

public class Main {

	public static int solution(int N){
	    
		int[] dp = new int[N+1];
		dp[0]=dp[1]=1;

		for(int i=2; i<=N; i++){
			for(int j=0; j<i; j++){
				dp[i] += dp[j]*dp[i-j-1];
			}
		}
		
		return dp[N-2];
	 }
	 
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		System.out.println(solution(n));
	}

}