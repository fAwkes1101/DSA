import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int m = scn.nextInt();
      System.out.println(getMazePaths(1,1,n,m));
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        if(sr==dr && sc==dc){
        ArrayList<String> base = new ArrayList<>();
        base.add("");
        return base;
        }
       ArrayList<String> ans = new ArrayList<>();
       int jump =1;
       while(sc+jump<=dc){
               ArrayList<String> rightPaths =getMazePaths(sr, sc+jump, dr, dc);
               for(String s : rightPaths){
                   ans.add("h"+jump+s);
               }
               
               jump++;
       }
       jump=1;
       while(sr+jump<=dr){
              
              ArrayList<String> downPaths =getMazePaths(sr+jump, sc, dr, dc);
               for(String s : downPaths){
                   ans.add("v"+jump+s);
               }
               
               jump++;
       } jump=1;
       while(sc+jump<=dc && sr+jump<=dr){
           ArrayList<String> diagPaths = getMazePaths(sr+jump, sc+jump, dr, dc);
               for(String s : diagPaths){
                   ans.add("d"+jump+s);
               }
               
               jump++;
          
       }


return ans;

    }

}
