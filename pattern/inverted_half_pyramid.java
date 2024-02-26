package pattern;
import java.util.*;
public class inverted_half_pyramid {
    public static void inv_half_pyr(int n){
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j < n-i; j++) {
                System.out.print(" \t");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        inv_half_pyr(6);
    }
}
