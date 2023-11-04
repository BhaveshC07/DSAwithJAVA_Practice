package Arrays;
import java.util.*;
public class largest_number {public static void main(String[] args) {int num[]={4,6,7,20,1,7,13,9,2,1};
        System.out.println("largest number is "+large(num));
    }public static int large(int num[]){
        int Max=Integer.MIN_VALUE;
        for (int i = 0; i <num.length ; i++) {if(Max<num[i]){
                Max=num[i];
            }}return Max;}}