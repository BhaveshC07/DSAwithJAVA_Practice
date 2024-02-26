package Recursion;

public class Q2 {
    public static void main(String[] args) {
        spell(2023);
    }
    static String digit[]={"zero", "one", "two", "three", "four", "five", "six",
            "seven", "eight", "nine"};
    public static void spell(int n) {
       if(n==0){
           return;
       }
       int lastdigit=n%10;
       spell(n/10);
        System.out.print(digit[lastdigit]+" ");
    }
}
