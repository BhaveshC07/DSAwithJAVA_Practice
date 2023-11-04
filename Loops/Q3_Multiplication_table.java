package Loops;
import java.util.*;
public class Q3_Multiplication_table {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number ");
        int n=sc.nextInt();
        for (int i = 1; i <=10 ; i++) {
            int mul=n*i;
            System.out.println(n+"*"+i+"="+mul);

        }
    }
}
