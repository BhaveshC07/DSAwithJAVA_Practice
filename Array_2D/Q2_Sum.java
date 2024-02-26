package Array_2D;
import java.util.*;
public class Q2_Sum {
    public static void main(String[] args) {
        int matrix[][]= { {1,4,9},{11,4,3},{2,2,3} };
        System.out.println("sum of second row is "+sum(matrix));
    }
    public static int sum(int matrix[][]){
        int i=1;
        int sum=0;
        for (int j = 0; j <matrix[0].length; j++) {
            sum+=matrix[i][j];
        }
        return sum;
    }
}
