package variable_and_data_types;
import java.util.Scanner;
public class Q3_Customer_bill {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the price of pencile");
        float pencil=sc.nextInt();
        System.out.println("enter the price of pen");
        float pen=sc.nextInt();
        System.out.println("enter the price of eraser");
        float eraser=sc.nextInt();
        float TotalPrice=(pen+pencil+eraser);
        float GST=TotalPrice*((float) 18 /100);
        System.out.println("PRICE AMOUNT="+TotalPrice);
        System.out.println("GST="+GST);
        System.out.println("total amount to be paid="+(TotalPrice+GST));
    }
}
