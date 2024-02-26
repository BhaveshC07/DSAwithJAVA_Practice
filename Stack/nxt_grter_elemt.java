package Stack;

import java.util.Stack;

public class nxt_grter_elemt {
    public static void main(String[] args) {
        int[] arr={6,7,2,8,1,4};
        Stack<Integer> s=new Stack<>();
        int[] arr1=new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            while(!s.isEmpty() && arr[s.peek()]<=arr[i] ){
                s.pop();
            }
            if(s.isEmpty()){
                arr1[i]=-1;
            }else{
                arr1[i]=arr[s.peek()];
            }
            s.push(i);
        }

        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]+" ");
        }
    }
}
