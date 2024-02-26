package Arrays;
import java.util.*;
public class smallest_number {
    public static int small(int num[]){
        int smallest=Integer.MAX_VALUE;
        for (int i = 0; i < num.length; i++) {
            if(smallest>num[i]){
                smallest=num[i];
            }
        }
        return smallest;
    }

    public static void main(String[] args) {
        int num[]={5,2,3,8,5,1};
        System.out.println("smallest number is "+small(num));
    }
}
