import java.util.*;

public class Main{
    public static int findInArr(int arr[],int val){
        int x=-1;
        for(int j=0;j<arr.length;j++){
            if(arr[j]==val)
                x=j;
        }  return x;
    }
        public static void main(String[] args)  {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++)
             arr[i]= scn.nextInt();
          
        int val = scn.nextInt();
        System.out.println(findInArr(arr,val));
}}
