package pattern;

public class pattern1 {
    public static void main(String[] args) {
        int n=10;
        for (int i = 0; i < n ; i++) {
            for (int j = n-i; j >1; j--) {
                System.out.print(" ");
            }
            for (int j =0; j <=i ; j++) {
                System.out.print("*");
            }
            for (int j = n+1; j <=n+i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <=n ; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 1+i; j <= n; j++) {
                System.out.print("*");
            }
            for (int j = n+2; j <=2*n-i; j++) {
                System.out.print("*");

            }
            System.out.println();
        }
    }
}
