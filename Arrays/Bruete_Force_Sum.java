package Arrays;
import java.util.*;
public class Bruete_Force_Sum {
    public static void main(String[] args) {
        int num[]={1,-2,6,-1,3};
        sum(num);
    }
    public static void sum(int num[]){
        int CurSum=0;
        int MaxSum=Integer.MIN_VALUE;
        for (int i = 0; i < num.length; i++) {
            for (int j = i; j < num.length; j++) {
                CurSum=0;
                for (int k = i; k <=j ; k++) {
                    CurSum+=num[k];
                }
                if(MaxSum<CurSum){
                    MaxSum=CurSum;
                }
            }

        }
        System.out.println(MaxSum);
    }
}