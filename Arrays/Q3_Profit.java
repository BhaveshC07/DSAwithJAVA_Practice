package Arrays;
import java.util.*;
public class Q3_Profit {
    public static void main(String[] args) {
        int prices[]={7, 1, 5, 3, 6, 4};
        System.out.println("Maximum profit is "+Profit(prices));
    }
    public static int Profit(int prices[]){
        int buyprice =Integer.MAX_VALUE;
        int maxprice=0;
        int index=0;
        for (int i = 0; i < prices.length; i++) {
            if (buyprice < prices[i]) {
                int profit = prices[i] - buyprice;
                index = i;
                if (index < i) {
                    maxprice = Math.max(buyprice, maxprice);
                }
            } else {
                buyprice = prices[i];
            }

        }

//        for (int i = index+1; i < prices.length; i++) {
//            if(buyprice<prices[i]){
//                maxprice=prices[i];
//            }
//        }
        System.out.println(buyprice);
        System.out.println(maxprice);
        return maxprice-buyprice;
    }
}
