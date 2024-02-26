package Sorting;
import java.util.*;
public class All_sort {
    public static void main(String[] args) {
        int arr[]={3, 6, 2, 1, 8, 7, 4, 5, 3, 1};
        //bubblesort(arr);
        //selectionsort(arr);
        //insertsort(arr);
        countsort(arr);
    }
    public static void bubblesort(int arr[]){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if(arr[j+1]<arr[j]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void selectionsort(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            int min=Integer.MAX_VALUE;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    arr[j]=arr[i];
                }
                arr[i]=min;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");

        }
    }
    public static void insertsort(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            int curr=arr[i];
            int prev=i-1;
            while(prev>=0&&arr[prev]>curr){
                arr[prev+1]=arr[prev];
                prev--;
            }
            arr[prev+1]=curr;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void countsort(int arr[]){
        int l=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            l = Math.max(l, arr[i]);
        }
        int count[]=new int[l+1];
        for (int i = 0; i < arr.length; i++) {
                count[arr[i]]++;
        }
        int j=0;
        for (int i = 0; i < count.length; i++) {
                while (count[i] > 0) {
                    arr[j] = i;
                    j++;
                    count[i]--;
                }
            }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}