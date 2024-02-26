package Loops;
import java.util.Scanner;
public class Q1_Sun_even_odd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean num=true;
        int sumEven=0;
        int sumOdd=0;
        while (num==true){
            System.out.print("Enter the number :");
            int n=sc.nextInt();

            if(n%2==0){
                sumEven=sumEven+n;
            }

            else{
                sumOdd=sumOdd+n;
            }
            System.out.println("Enter 0 for Sum of the numbers");
            if(n==0){
                System.out.println("sum of even numbers is= "+sumEven);
                System.out.println("sum of odd numbers is= "+sumOdd);
                num=false;
            }


        }
    }
}
