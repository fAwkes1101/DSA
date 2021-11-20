import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn= new Scanner(System.in);
        int n =scn.nextInt();
        int m = scn.nextInt();
        int [][]arr= new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                 arr[i][j]= scn.nextInt();
            }
        }
        int direction =0, row=0,col=0;

        while(row>=0 && col>=0 && row<n && col<m) {

            //check value of element at row,col and update direction
            if (arr[row][col] == 1) {
                direction = (direction + 1) % 4;
            }
            //Taking steps forward
            if (direction == 0) {
                col++;
            } else if (direction == 1) {
                row++;
            } else if (direction == 2) {
                col--;
            } else {
                row--;
            }
        }
        // Printing output using value of direction
        if(direction==0){
            System.out.println(row+"\n"+ (col-1));
        }
        else if(direction==1){
            System.out.println(row-1+"\n"+col);
        }
        else if(direction==2){
            System.out.println(row+"\n"+col+1);
        }
        else{
            System.out.println(row+1+"\n"+col);
        }

    }

}
