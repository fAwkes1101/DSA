import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[][] arr= new int[n][n];
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            arr[i][j] = scn.nextInt();
        }
    } 
    transpose(arr);
    reverse(arr);
    display(arr);



    }
    public static void reverse(int[][] arr){
        int n = arr.length;
     for(int i=0;i<n ; i++){
         for(int j =0;j<n/2 ;j++){
         int temp = arr[i][j];
         arr[i][j]= arr[i][n-1-j];
         arr[i][n-1-j]= temp;

         }
     }



    }
    public static void transpose(int[][] arr){
   int n = arr.length;
    for(int i=0 ; i<n ;i++){
        for(int j=i+1; j<n ; j++){
         int temp=0;
         temp = arr[i][j];
         arr[i][j]= arr[j][i];
         arr[j][i]=temp;
        }
    }  
 }

    public static void display(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}
