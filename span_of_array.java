import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int[] arr= new int[8];

        for(int i=0;i<8; i++){
            arr[i] = scn.nextInt();
        }
        int min= Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<8;i++){

            if(arr[i]<min)
                min=arr[i];
            if(arr[i]>max)
                max= arr[i];

        }
        System.out.println(max-min);
    }
}
