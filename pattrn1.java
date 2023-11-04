import java.util.*;
public class pattrn1 {
    public static void main(String[] args) {
        int n=9;
        int k=n,t=0;
        for (int i = n; i >0 ; i--) {
            while(t<n) {
                for (int l = 0; l < i ; l++) {
                    System.out.print(k - t+" ");
                }
                t++;
            }
            t=0;
            System.out.println();
    }}} 