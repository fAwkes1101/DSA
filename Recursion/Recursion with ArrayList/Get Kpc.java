import java.io.*;
import java.util.*;

public class Main {
    
    static String[] dtoc = {".;","abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};
    public static void main(String[] args) throws Exception {
     Scanner scn = new Scanner(System.in);
     String str = scn.next();
     System.out.println(getKPC(0, str));

    }

    public static ArrayList<String> getKPC(int idx, String str) {
       
       if(idx==str.length()){
           ArrayList<String> base = new ArrayList<>();
           base.add("");
           return base;
        
       }

      ArrayList<String> smallSub= getKPC(idx+1, str);
      ArrayList<String> ans = new ArrayList<>();

      for(Character letter : dtoc[str.charAt(idx)-'0'].toCharArray()){
                             //str.charAt(idx) will return asci value // toCharArray makes the string eligible for for in loop
          for(String st : smallSub){
                ans.add(letter + st);
       
          }
      }
      return ans;







    }

}
