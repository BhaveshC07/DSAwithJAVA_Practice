package Stack;

import java.util.Stack;

public class rev_string {
    public static void main(String[] args) {
        String n="bhavesh";

        System.out.println(revString(n));
    }

    public static String revString(String str){
        Stack<Character> s=new Stack<>();
        int index=0;
        while(index< str.length()){
            s.push(str.charAt(index));
            index++;
        }
        StringBuilder sb=new StringBuilder();
        while(!s.isEmpty()){
            sb.append(s.pop());
        }
        return sb.toString();
    }
}
