package Arrays;
import java.util.*;
public class Array_Pairs {
    public static void main(String[] args) {
        int num[]={1,2,3,4,5,6};
        pair(num);
    }
    public static void pair(int num[]){
        for (int i = 0; i < num.length; i++) {
            for (int j = i; j <num.length   ; j++) {
                    System.out.print("("+num[i]+","+num[j]+")");
            }
            System.out.println();
        }
    }
}
