package pattern;

public class hollow_rect {
    public static void main(String[] args) {
        holl_rectangle(10,7);
    }public static void holl_rectangle(int trow,int tcol){
        for (int i = 1; i <= trow; i++) {
            for (int j = 1; j <=tcol ; j++) {
                if(i==1||j==1||i==trow||j==tcol){
                    System.out.print("*\t");
                }else {
                    System.out.print(" \t");
                }
            }
            System.out.println();
        }
    }
}