package Strings;
import java.util.*;
public class compression1 {
    public static void main(String[] args) {
        StringBuilder name=new StringBuilder("");
        String newname="aaabbcccdd";
        for (int i = 0; i < newname.length();i++) {
            int count=1;
            while(i<newname.length()-1&&newname.charAt(i)==newname.charAt(i+1)){
                count++;
                i++;
            }
            name=name.append(newname.charAt(i));
            if(count>1){
                name=name.append(count);
            }

        }
        System.out.println(name);
        //System.out.println(10&4);
    }
}
