package Recursion;
public class CreateString {
    public static void main(String[] args){
        BinString(3,0," ");
    }
    public static void BinString(int n, int lastDigit,String str) {
        if (n == 0) {
            System.out.println(str);
            return;
        }
        BinString(n - 1, 0, str + "0");
        if (lastDigit == 0) {
            BinString(n - 1, 1, str + "1");
        }
    }
}