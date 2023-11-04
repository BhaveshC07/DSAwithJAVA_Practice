package variable_and_data_types;
import java.util.Scanner;
public class Q4_What_is_op {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        byte b=4;
        char c='a';
        short s=512;
        int i=1000;
        float f=3.14f;
        double d=99.9954;

        System.out.println("output is "+ ((f*b)+(i%c)-(d*s)));
    }
}
