import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][n];

        for (int j = 0; j < n; j++) {
            String line = br.readLine();
            for (int k = 0; k < n; k++) {
                arr[j][k] = line.charAt(k) - '0';
            }
        }

        findCelebrity(arr);

    }

    public static void findCelebrity(int[][] arr) {
        // if a celebrity is there print it's index (not position), if there is not then
        // print "none"
        Stack<Integer> stk = new Stack<>();
        for(int i=0; i<arr.length; i++){
            stk.push(i);
        }
        while(stk.size()>=2){
            int i = stk.pop();
            int j =stk.pop();
            
            if(arr[i][j]==0){
                stk.push(i);
            }else{
                stk.push(j);
            }
            
        }
        int ans = stk.pop();
        for(int i=0; i<arr.length;i++){
            if(i!=ans){
                if(arr[ans][i]!=0 || arr[i][ans]!=1){
                    System.out.println("none");
                    return;
                }
            }
        }
        System.out.println(ans);
    }

}
