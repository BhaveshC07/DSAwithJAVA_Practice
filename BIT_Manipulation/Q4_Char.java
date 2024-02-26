package BIT_Manipulation;

public class Q4_Char {
    public static void main(String[] args) {
// Convert uppercase character to lowercase
        for (char ch = 'a'; ch <= 'z'; ch++) {
            System.out.print((char)(ch | ' '));
// prints abcdefghijklmnopqrstuvwxyz
        }
    }

}
