package ArrayList;

import java.util.ArrayList;

public class pairSum1 {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(11);
        list.add(16);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(10);
        System.out.println(sum(list,21));
    }
    public static boolean sum(ArrayList<Integer>list,int target){
        int lp=0;
        int rp=list.size()-1;
        while(lp!=rp){
            if(list.get(lp)+list.get(rp)==target){
                return true;
            }
            if(list.get(lp)+list.get(rp)>target){
                lp++;
            }else {
                rp--;
            }
        }
        return false;
    }
}
