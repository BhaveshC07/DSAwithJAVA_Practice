package pattern;
import java.util.*;
public class hollow_rhimbus {
    public static void main(String[] args) {
        hollow(5);
    }
    public static void hollow(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n-i; j++) {
                System.out.print(" \t");

            }
            for (int j = 1; j <=n; j++) {
                if(i==1 || j==1||i==n||j==n){
                    System.out.print("*\t");
                }else{
                    System.out.print(" \t");
                }
            }
            System.out.println();
        }
    }
}
