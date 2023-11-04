package Arrays;
import java.util.*;
public class BUYorSELL {
    public static void main(String[] args) {
        int price[]={7,2,5,3,6,1 };
        System.out.println("max profit is at  "+stock(price));
    }
    public static int stock(int prices[]){
        int buyprice =Integer.MAX_VALUE;
        int maxprice=0;
        for (int i = 0; i < prices.length; i++) {
            if(buyprice<prices[i]){
                int profit=prices[i]-buyprice;
                maxprice=Math.max(buyprice,maxprice);
            }else {
                buyprice=prices[i];
            }
        }return maxprice;
    }
}
