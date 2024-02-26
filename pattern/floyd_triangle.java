package pattern;
import java.util.*;
public class floyd_triangle {
    public static void main(String[] args) {
        floyd(5);
    }
    public static void floyd(int n){
        int ch=1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <i ; j++) {
                System.out.print(ch+"\t");
                ch++;
            }
            System.out.println();
        }
    }
}
