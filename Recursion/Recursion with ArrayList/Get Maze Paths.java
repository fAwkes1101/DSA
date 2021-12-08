import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int m = scn.nextInt();
      System.out.println(getMazePaths(0,0,n-1,m-1));

    

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
        if(sr>dr || sc>dc){
        ArrayList<String> base = new ArrayList<>();
        
        return base;
        }
        
        
      
        
      ArrayList<String> ans = new ArrayList<>();
     
      ArrayList<String> small1 = getMazePaths(sr+1,sc, dr, dc );
      for(String str : small1){
          ans.add("h"+str);
      
      }
     
      ArrayList<String> small2 = getMazePaths(sr, sc+1, dr, dc) ;
      for(String str : small2){
          ans.add("v"+str);
    
      } 
      

    return ans;
    }


}
