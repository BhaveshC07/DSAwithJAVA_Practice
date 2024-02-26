package pattern;

public class _0_1_Triangle {
    public static void main(String[] args) {
        tri(5);
    }
    public static void tri(int n){
        int ch=1;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <i; j++) {
                if(ch%2==0){
                    System.out.print("0\t");
                }
                else{
                    System.out.print("1\t");
                }
                ch++;
            }
            System.out.println();
        }
    }
}
