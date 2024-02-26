package function_nd_methods;
import java.util.*;
public class Q3_palindrome {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the number ");
        int n=sc.nextInt();
        int n1=Palindrome(n);
        if(n==n1){
            System.out.println("number is palindrome ");
        }
        else {
            System.out.println("number is not palindrome");
        }
    }
    public static int Palindrome(int n) {
        int sum = 0;
        while (n > 0) {
            int rem = n % 10;
            sum = sum * 10 + rem;
            n = n / 10;
        }
        return sum;
    }
}
