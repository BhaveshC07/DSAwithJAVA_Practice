package ArrayList;

import java.util.ArrayList;

public class pairsum2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(4);
        list.add(4);
        list.add(2);
        list.add(2);
        list.add(8);
        sum(list, 201);
    }

    public static void sum(ArrayList<Integer> arr, int target) {
        ArrayList<Integer> list = new ArrayList<>();
        while (arr.size() > 1) {
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < arr.size(); i++) {
                min = Math.min(min, arr.get(i));
            }
            list.add(arr.size());
            for (int i = 0; i < arr.size(); i++) {
                if(arr.size()==1){
                    list.add(1);
                }
                if (arr.get(i) == min) {
                    arr.remove(i);
                    i--;
                }

                System.out.println("array is " + arr);
            }
            for (int i = 0; i < arr.size(); i++) {
                arr.set(i, arr.get(i) - min);
            }
            System.out.println(list);
        }
    }
}