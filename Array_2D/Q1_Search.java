package Array_2D;
import java.util.*;
public class Q1_Search {
    public static void main(String[] args) {
        int matrix[][]= { {4,7,8},{8,8,7} };
        int key=8;
        search(matrix,key);
    }
    public static void search(int matrix[][],int key){
        int count=0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if(key==matrix[i][j]){
                    count++;
                }
            }
        }
        System.out.println(key+" is found "+count+ " times");
    }
}
