package Stack;

import java.util.Stack;

public class max_area_histogram {

    public static int maxArea(int arr[]){
        int[] nsl=new int[arr.length];
        int[] nsr=new int[arr.length];

        //next small right
        Stack<Integer> s=new Stack<>();
        for (int i = arr.length-1; i>=0 ; i--) {
            while(!s.isEmpty() && arr[s.peek()]>=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsr[i]=arr.length;
            }else{
                nsr[i]=s.peek();
            }
            s.push(i);
        }
        s=new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            while(!s.isEmpty() && arr[s.peek()]>=arr[i]){
                s.pop();
            }

            if(s.isEmpty()){
                nsl[i]=-1;
            }else {
                nsl[i]=s.peek();
            }
            s.push(i);
        }
        int area=0;
        for (int i = 0; i < arr.length; i++) {
            int area1=arr[i]*(nsr[i]-nsl[i]-1);
            area=Math.max(area,area1);
        }
        return area;
    }

    public static void main(String[] args) {

        int[] arr={2,1,5,6,2,3};
        System.out.println(maxArea(arr));
    }
}
