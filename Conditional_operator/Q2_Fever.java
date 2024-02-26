package Conditional_operator;
import java.util.*;
public class Q2_Fever {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double temp=sc.nextDouble();
        if(temp>=100){
            System.out.println("you have fever \n go to doctor");
        }
        else{
            System.out.println("no fever ");
        }
    }
}
