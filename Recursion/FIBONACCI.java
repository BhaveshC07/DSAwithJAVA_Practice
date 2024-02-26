package Recursion;

public class FIBONACCI {
    public static void main(String[] args) {
        int n=10;
        System.out.println(Fibo(100));
    }
    public static long Fibo(int n){
        if(n==0||n==1){
            return n;
        }
        long f1=Fibo(n-1);
        long f2=Fibo(n-2);
        return f1+f2;
    }
}
