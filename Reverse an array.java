import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args){

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr= new int [n];

        for(int i = 0 ;i<n ;i++){
            arr[i]= scn.nextInt();
        }

        for(int i =0;i<n/2;i++){
            int temp = arr[i];

            arr[i]=arr[n-1-i];
            arr[n-1-i]=temp;
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+"\t");
        }
        }

    }
