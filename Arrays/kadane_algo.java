package Arrays;
import java.util.*;
public class kadane_algo {
    public static void main(String[] args) {
        int num[]={1,-2,6,-1,3};
        sum(num);
    }
    public static void sum(int num[]) {
        int cursum = 0;
        int maxsum = Integer.MIN_VALUE;
        for (int i = 0; i < num.length; i++) {
                cursum= cursum+num[i];
                if(cursum<0){
                    cursum=0;
                }
                maxsum=Math.max(maxsum,cursum);
        }
        System.out.println(maxsum);
            }
}