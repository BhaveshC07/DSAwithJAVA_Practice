package pattern;
import java.util.*;
public class butterfly_pattern {
    public static void main(String[] args) {
       Buuterfly(15);

    }
    public static void Buuterfly(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("😁\t");
            }
            for (int j = 0; j < 2*(n-i); j++) {
                System.out.print(" \t");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("😁\t");
            }
            System.out.println();
        }
        for (int i = n; i >=1 ; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("😁\t");
            }
            for (int j = 0; j < 2*(n-i); j++) {
                System.out.print(" \t");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("😁\t");
            }
            System.out.println();
        }
    }
}
