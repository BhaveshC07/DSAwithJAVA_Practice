package BIT_Manipulation;
import java.util.*;
public class Q2_Swap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int a=sc.nextInt();
        int b=sc.nextInt();
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println(" a is "+a+ " ans b is  "+b);
    }
}
