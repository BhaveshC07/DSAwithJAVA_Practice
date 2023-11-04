package Array_2D;
import java.util.*;
public class SPIRAL_MATRIX {
    public static void main(String[] args) {
        int mat[][]={
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}};
        spiral(mat);
    }
    public static void spiral(int mat[][]){
        int startRow=0;
        int startColumn=0;
        int endRow=mat.length-1;
        int endColumn=mat[0].length-1;
        while(startRow<=endRow&&startColumn<=endColumn){
            for (int j = startColumn; j <=endColumn ; j++) {
                System.out.print(mat[startRow][j]+" ");
            }
            for (int i = startRow+1; i <=endRow ; i++) {
                System.out.print(mat[i][endColumn]+" ");
            }
            for(int j=endColumn-1;j >=startColumn; j--){
                System.out.print(mat[endRow][j]+" ");
            }
            for (int i = endRow-1; i >=startRow+1 ; i--) {
                System.out.print(mat[i][startColumn]+" ");
            }
            startRow++;
            startColumn++;
            endColumn--;
            endRow--;

        }
    }

}
