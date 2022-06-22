import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();

        HashMap<Character, Integer> hm = new HashMap<>();
        
        Integer max=0;
        Character ans = str.charAt(0);
        for(int i=0; i<str.length(); i++){
            Character ch=str.charAt(i);
            if(hm.containsKey(ch)){
                  hm.put(ch, hm.get(ch)+1);
            }else{
                  hm.put(ch, 1);
            }
            
            if(hm.get(ch)>max){
                max= hm.get(ch);
                ans = ch;
            }
        }
      System.out.println(ans);
    }

}
