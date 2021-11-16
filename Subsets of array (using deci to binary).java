import java.io.*;
import java.util.*;

public class Main{
     public static int  deci_to_binary(int num){

        int result =0;
        int mf = 1;
        int rem=0;
    while(num>0) {
         rem = num % 2;

        result = result + rem * mf;
        num /= 2;
        mf *= 10;} 
        return result;
    }

public static void main(String[] args) throws Exception {
    
   Scanner scn = new Scanner(System.in);
   int n= scn.nextInt();
   int[] arr = new int[n];
   for(int i=0;i<n;i++){
       arr[i] = scn.nextInt();
   }
   int total_subset =(int) Math.pow(2,n);

   for(int i = 0; i<total_subset; i++){
    int binary = deci_to_binary(i);
    int power= (int)Math.pow(10,n-1);
     
    for(int j=0 ;j<n ; j++){
     int k = binary/power % 10;

     if(k==1){
         System.out.print(arr[j]+"\t");
     }
     else{
         System.out.print("-\t");
     }
     power/=10;
    }

System.out.println();
   }

 }

}
