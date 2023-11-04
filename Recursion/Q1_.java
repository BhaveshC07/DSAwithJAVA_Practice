package Recursion;

public class Q1_ {
    public static void main(String[] args) {
        int arr[ ] = {3, 2, 4, 5, 6, 2, 7, 2, 2};
         int key = 2;
         index(arr,key,0);
    }
    public static void index(int arr[],int key,int i){
        if(i==arr.length){
            return;
        }
        if(arr[i]==key){
            System.out.print (i+" ");
        }
        index(arr,key,i+1);
    }
}
