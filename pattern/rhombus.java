package pattern;
import java.util.*;
public class rhombus {
    public static void main(String[] args) {
        rhom(5);
    }
    public static void rhom(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < n; j++) {
                System.out.print("*  ");
            }
            System.out.println();
        }
    }
}
