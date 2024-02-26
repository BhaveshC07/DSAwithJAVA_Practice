package BIT_Manipulation;
import java.util.*;
public class modular_expo {
    public static void main(String[] args) {
        System.out.println(modu(3,5));
    }
    public static int modu(int x,int n){
        int ans=1;
        while (n>0){
            if((n%2==1)){
                ans=(ans*x);
                n--;
            }
            x=(x*x);
            n=n/2;
        }
        return ans;
    }
}
