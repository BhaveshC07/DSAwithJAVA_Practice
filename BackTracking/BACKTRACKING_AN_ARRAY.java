package BackTracking;

public class BACKTRACKING_AN_ARRAY {
    public static void main(String[] args) {
        int arr[]=new int[5];
        changeArr(arr,0,1);
        printArr(arr);
    }
    public static void changeArr(int arr[],int i,int v){
        //base case
        if(i==arr.length){
            printArr(arr);
            return;
        }
        //kaam
        arr[i]=v;
        changeArr(arr,i+1,v+1);
        arr[i]=arr[i]-2;
    }
    public static void printArr(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
