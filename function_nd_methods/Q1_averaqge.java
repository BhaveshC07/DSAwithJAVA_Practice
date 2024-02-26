package function_nd_methods;

import java.util.Scanner;
import java.util.*;
public class Q1_averaqge {
    public static void main(String[] args) {
        int n=100;
//        Scanner sc=new Scanner(System.in);
//        System.out.println("enter three numbers ");
//        int a=sc.nextInt();
//        int b=sc.nextInt();
//        int c=sc.nextInt();
//        System.out.println("average of three numbers is "+avg(a,b,c));
        int ans = 0;
        while(n!=0){
            if((n&1) == 1){
                ans++;
                System.out.println("ans is 1 "+ans);
            }
            else{
                ans++;
                System.out.println("ans is 2 "+ans);
            }
            n = n>>1;
            System.out.println("n is "+n);
        }
    }
//    public static double avg(int a,int b,int c){
//        double avg=(double) (a+b+c)/3;
//        return avg;
//    }
}
