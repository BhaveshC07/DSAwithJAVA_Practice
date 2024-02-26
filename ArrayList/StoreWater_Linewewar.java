package ArrayList;
import java.util.*;
import java.util.ArrayList;

public class StoreWater_Linewewar {
    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(11);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(12);
        height.add(3);
        height.add(7);
        WaterLevel(height);
    }

    public static void  WaterLevel(ArrayList<Integer> height) {
        int maxwater = 0;
        int lp = 0;
        int rp = height.size() - 1;

        while (lp < rp){
            int ht = Math.min(height.get(lp), height.get(rp));
            int width = rp - lp;
            int currWater = ht * width;
            maxwater = Math.max(maxwater, currWater);

            if (height.get(lp) < height.get(rp)) {
                lp++;
            } else {
                rp--;
            }
        }
        System.out.println(maxwater);
    }
}