package Divide_n_Conquor;

public class quick_sort {
    public static void main(String[] args) {
        int arr[]={6,3,9,8,2,5};
        quicksort(arr,0, arr.length-1);
        print(arr);
    }
    public static void quicksort(int arr[],int si,int ei){
        if (si>=ei){
            return;
        }
        int p=partition(arr,si,ei);
        quicksort(arr,si,p-1) ; // left part
        quicksort(arr,p+1,ei);  //right part
    }
    public static int partition(int arr[],int si,int ei){
        int pivot=arr[ei];
        int i=si-1;//to make place for element smaller than pivot
        for (int j = si; j < ei; j++) {
            if(arr[j]<=pivot){
                i++;
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        i++;
        int temp=pivot;
        arr[ei]=arr[i];
        arr[i]=temp;
        return i;

    }
    public static void print(int arr[]){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
