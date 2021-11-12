import java.util.*;

public class Main {

    public static int  deci_to_b2(int num,int b2){

        int result =0;
        int mf = 1;
        int rem=0;
    while(num>0) {
         rem = num % b2;

        result = result + rem * mf;
        num /= b2;
        mf *= 10;} 
        return result;
    }
    public static int b1_to_deci(int num, int b1){
        int result=0;
        int mf=1;
        int rem=0;
        while(num>0){
            rem=num % 10;
            result=result + rem*mf;
            num/=10;
            mf *=b1; }
        return result;
       }
    public static void main(String[] args) {
        Scanner scn;
        scn = new Scanner(System.in);

        int b1 = scn.nextInt();
        int b2=scn.nextInt();
        int num = scn.nextInt();
        System.out.println(deci_to_b2(b1_to_deci(num, b1), b2));

    }
}
