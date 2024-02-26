package Stack;

public class fibsum {
    public static void main(String[] args) {
        System.out.println(fibSum(8));
    }
        static long fibSum(long N){
            //code here
            if(N==0)return 0;
            long f=fib(N);
            return f+fibSum(N-1);
        }
        static long fib(long n){
        if(n==0)return 0;
        if(n==1)return 1;
        return fib(n-1)+fib(n-2);
        }
    }
