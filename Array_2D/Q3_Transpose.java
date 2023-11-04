package Array_2D;
import java.util.*;
public class Q3_Transpose {
    public static void main(String[] args) {
        int matrix[][]={
                {1,2,3,4,5,6},
                {7,8,9,10,11,12},
                {13,14,15,16,17,18}};
        Transp(matrix);
    }
    public static void Transp(int matrix[][]){
        int TransposeMatrix[][]=new int [matrix[0].length][matrix.length];
        for (int i = 0; i < TransposeMatrix.length; i++) {
            for (int j = 0; j < TransposeMatrix[0].length; j++) {
                TransposeMatrix[i][j]=matrix[j][i];
            }
        }
        for (int i = 0; i < TransposeMatrix.length ; i++) {
            for (int j = 0; j < TransposeMatrix[0].length; j++) {
                System.out.print(TransposeMatrix[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
