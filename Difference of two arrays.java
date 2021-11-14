import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args){

        Scanner scn = new Scanner(System.in);
        
        int n1 = scn.nextInt();
        int[] arr1= new int[n1];
        for(int i=0;i<n1;i++){
            arr1[i]= scn.nextInt();
        }

        int n2 = scn.nextInt();
        int[] arr2= new int[n2];
        for(int i=0;i<n2;i++){
            arr2[i]= scn.nextInt();
        }
        int[] arr3 =new int[n2];
        int carry=0, i1=n1-1 ,i2=n2-1, i3= arr3.length-1;
        while(i3>=0){
            int d1= i1>=0 ? arr1[i1]: 0;
            int d2= i2>=0 ? arr2[i2]: 0;
            int temp = d2-d1+carry;
            if(temp<0){
                temp=temp+10;
                carry=-1;          
            else
                carry=0;
            arr3[i3]= temp;
            i1--; i2--; i3--;
            }
        int index=0;
        while(arr3[index]==0)
            index++;
       for(int i =index ;i<arr3.length;i++)
            System.out.println(arr3[i]);
        }

    }
