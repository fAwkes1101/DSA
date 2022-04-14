import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        int[] arr = new int[n];
        for(int i=0; i<n ;i++){
            arr[i]= scn.nextInt();
        }
        
        int tar = scn.nextInt();
        boolean[][] dp = new boolean[n+1][tar+1];

        for(int i=0; i<n+1;i++){
            for(int j=0; j < tar+1 ;j++){

                if(i==0 && j==0){
                    dp[i][j]=true;
                }
                else if(i==0){
                    dp[i][j]=false;
                }
                else if(j==0){
                    dp[i][j]=true;
                }
                else{
                     if(dp[i-1][j]==true){
                         dp[i][j]=true;
                     }
                     else{
                        int ele = arr[i-1];
                        if(ele<=j){
                            if(dp[i-1][j-ele]==true){
                                dp[i][j]= true;
                            }
                        }
                     }

                }
            }
        }
        System.out.println(dp[n][tar]);
    }
}
