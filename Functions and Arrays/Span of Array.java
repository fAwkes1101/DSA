import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr= new int[n];

        for(int i=0;i<n; i++){
            arr[i] = scn.nextInt();
        }
        int min= Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){

            if(arr[i]<min)
                min=arr[i];
            if(arr[i]>max)
                max= arr[i];

        }
        System.out.println(max-min);
    }
}
