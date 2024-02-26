package pattern;
import java.util.*;
public class inv_half_pyr_num {
    public static void main(String[] args) {
        inv_pyr(5);
    }
    public static void inv_pyr(int n){
        for (int i = 1; i <=n; i++) {
            for (int j = 0; j < n-i; j++) {
                System.out.print(" \t");
            }
            for (int j = i; j >0 ; j--) {
                System.out.print(j+"\t");
            }
            System.out.println();
        }
    }
}
