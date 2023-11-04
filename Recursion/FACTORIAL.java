package Recursion;
public class FACTORIAL {
    public static void main(String[] args) {
        int n=5;
        System.out.println(fact(n));
    }

public static int fact(int n){
        if(n==0){
            return 1;
        }
        int facto=fact(n-1);
        int fact=n*facto;
        return fact;
    }
}
