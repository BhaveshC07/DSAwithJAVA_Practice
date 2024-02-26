package Recursion;

public class Q4 {
    public static void main(String[] args) {
        String str="abcab";
        int n=str.length();
        System.out.println(count(str,0,n-1,n));
    }
    public static int count(String str,int i,int j,int n){
        if(n==1){
            return 1;
        }
        if(n<=0){
            return 0;
        }
        return str.substring(i).length();
    }
}
