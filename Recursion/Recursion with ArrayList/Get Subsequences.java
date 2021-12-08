import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
          Scanner scn = new Scanner(System.in);
          String str = scn.next();
          System.out.println(gss(0, str));

    }

    public static ArrayList<String> gss(int idx, String str) {
       
       if(idx==str.length()) {
           ArrayList<String> base= new ArrayList<>();
           base.add("");
           return base;
       }
        
       ArrayList<String> smallsub = gss(idx+1, str);

       ArrayList<String> ans = new ArrayList<>();

       for(String st : smallsub){ // Adding smallsub characters to the ans. //NO

            ans.add(st);
       }
       for(String st : smallsub){ // Adding small sub and included char of the orignal str to ans. //YES

           ans.add(str.charAt(idx)+ st);
       }
       return ans;




    }

}
