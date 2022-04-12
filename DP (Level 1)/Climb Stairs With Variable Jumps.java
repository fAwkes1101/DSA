import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] arr= new int[n];
        for(int i=0; i<n; i++){
           arr[i]= scn.nextInt();
        }

        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);
        dp[n] = 1; // n->n jane ke tarike
        System.out.println(csv(0,n,arr));
        System.out.println(csvMemo(0,n,arr,dp));
        System.out.println(csvTab(arr));
    }
    
    //Recursive solution
    public static int csv(int src, int dest, int[] arr){
        if(src>dest) return 0;
        if(src==dest) return 1;
        
        int totalPaths=0;
        for(int jump=1; jump<=arr[src]; jump++){
           int xi = csv(src+jump, dest, arr);
           totalPaths += xi;
        }

        return totalPaths;
       
    }

    //Memoisation
    public static int csvMemo(int src, int dest, int[] arr, int[] dp){
        if(src>dest) return 0;
        if(src==dest) return 1;
        
        if(dp[src]!=-1) return dp[src];

        int totalPaths=0;
        for(int jump=1; jump<=arr[src]; jump++){
           int xi = csvMemo(src+jump, dest, arr, dp);
           totalPaths += xi;
           
        }
        dp[src]= totalPaths;
        return dp[src];
       
    }

    //Tablation
    public static int csvTab(int[] arr){
       int[] dp = new int[arr.length+1];
       int dpSize = dp.length;

       dp[dpSize-1]= 1; // n->n jane ke tarike

       for(int i = dpSize-2 ; i>=0; i--){ //smaller to larger problem
          
          for(int jump=1; jump<=arr[i]; jump++){

              if(i+jump<dpSize){
                 dp[i] += dp[i+jump];
              }
          }
       }
       return dp[0];
 }


}
