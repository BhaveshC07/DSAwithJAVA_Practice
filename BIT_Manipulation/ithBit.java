package BIT_Manipulation;

public class ithBit {
    public static void main(String[] args) {
        System.out.println(getIthBit(4,2));
//        int a=((-1)<<(4+1));
//        int b=(1<<2)-1;
//        int c=a|b;
//        System.out.println(10&c);
    }
    public static int getIthBit(int n,int i){
        int bitmark=1<<i;
        if((n&bitmark)==0){
            return 0;
        }else {
            return 1;
        }
    }
}
