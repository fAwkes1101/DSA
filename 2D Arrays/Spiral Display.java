import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m =scn. nextInt();
        int[][] arr= new int[n][m];
        for(int i=0;i<n;i++){
         for(int j=0;j<m;j++){
            arr[i][j] = scn.nextInt();
         }
        } 
        int count = 0;
        int ele = m*n;
        int tfrow=0, tfcol=0, brrow =n-1, brcol=m-1;
        while(true){
        
        for(int i=tfrow; i<=brrow;i++){
        
        System.out.println(arr[i][tfcol]);
        count++;
        if(count==m*n)
        return;
        }
        tfcol++;
        for(int j=tfcol ;j<=brcol;j++){
            System.out.println(arr[brrow][j]);
            count++;
             if(count==ele)
        return;
        }
        brrow--;
        for(int i=brrow; i>=tfrow;i--){
        
        System.out.println(arr[i][brcol]);
        count++;
        if(count==ele)
        return;
        }
        brcol--;
        for(int j=brcol ; j>=tfcol ;j--){
            System.out.println(arr[tfrow][j]);
            count++;
        if(count==m*n)
        return;
        }
        tfrow++;

        }

    }

}
