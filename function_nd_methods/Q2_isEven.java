package function_nd_methods;
import java.util.*;
public class Q2_isEven {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number ");
        int n=sc.nextInt();
        System.out.println(isEven(n));
    }
    public static boolean isEven(int n){
        boolean iseven=true;
        if(n%2==0) {
            return true;
        }else {
            return false;
        }
    }
}
