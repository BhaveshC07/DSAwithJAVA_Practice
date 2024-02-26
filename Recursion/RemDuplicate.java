package Recursion;
import java.util.*;
public class RemDuplicate {
    public static void main(String[] args) {
        String str = "appnnacollege";
        remDup(str,0,new StringBuilder(""),new boolean[26]);
    }
    public static void remDup(String str,int idx,StringBuilder sb,boolean map[]){
        if(idx==str.length()){
            System.out.println(sb);
            return;
        }
        char currChar=str.charAt(idx);
        if(map[currChar-'a']==true){
            remDup(str,idx+1,sb,map);
        }
        else {
            map[currChar-'a']=true;
            remDup(str,idx+1,sb.append(currChar),map);
        }
        }
    }

