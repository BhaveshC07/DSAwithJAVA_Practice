package Arrays;
import java.util.*;
public class binary_search {
    public static void main(String[] args) {
        int num[]={1,3,4,5,8,6,9,14};
        int key=1;
        System.out.println("Key is at index of "+Search(num,key));
    }
    public static int Search(int num[],int key){
        int st=0;
        int end=num.length-1;
        while(st<=end){
            int mid=(st+end)/2;
            if(num[mid]==key){
                return mid;
            }
            if (num[mid] < key) {
                st=mid+1;
            }else {
                end=mid-1;
            }
        }
        return -1;
    }

}
