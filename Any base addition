import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scn;
        scn = new Scanner(System.in);
        int b = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        int carry=0;
        int result=0;
        int multi=1;
        while(n1>0 || n2>0 || carry>0){
            int temp= n1%10 + n2%10 + carry;
            int qu = temp/b;
            carry = qu;
            int re = temp%b;
            n1/=10; n2/=10;
            result += re*multi;
            multi *= 10;
        }
        System.out.println(result);
        
    }
}
