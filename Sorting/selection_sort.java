package Sorting;
import java.util.*;
public class selection_sort {
    public static void main(String[] args) {
        int arr[]={5,6,1,3,2,4};
        sort(arr);
    }
    public static void sort(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            int min=Integer.MAX_VALUE;
            for (int j = i; j <arr.length ; j++) {
                if(min>arr[j]){
                    min=arr[j];
                    arr[j]=arr[i];
                }
                arr[i]=min;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
