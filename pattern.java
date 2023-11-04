public class pattern {
    public static void main(String[] args) {
        int n=4;
        print(n);
    }
    public static void print(int n){
        for (int i =n; i >0; i--) {
            for (int j = n; j >i; j--) {
               System.out.print(j+"\t");
            }
            for (int j = 2; j <=2*i ; j++) {
               System.out.print(i+"\t");
            }
            for (int j = i+1; j <=n ; j++) {
                System.out.print(j+"\t");
            }
        System.out.println();
    }
        for (int i = 2; i <=n; i++) {
            for (int j = n; j >i; j--) {
                System.out.print(j+"\t");
            }
            for (int j = 2; j <=2*i ; j++) {
                System.out.print(i + "\t");
            }
            for (int j = i+1; j <=n ; j++) {
                System.out.print(j+"\t");
            }
            System.out.println();
        }
    }
}