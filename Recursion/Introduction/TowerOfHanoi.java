import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sorc = scn.nextInt();
        int dest = scn.nextInt();
        int aux = scn.nextInt();
        toh(n,sorc,dest,aux);
    }

    public static void toh(int n, int sorc, int dest, int aux){
        if(n==0) return;
        toh(n-1, sorc, aux, dest);

        System.out.println(n + "[" + sorc + " -> "+ dest+ "]");

        toh(n-1, aux, dest, sorc);
    }

}
