package Stack;

import java.util.Stack;

public class palindrome_check {

    public static boolean isCheck(String str){
        Stack<Character> s=new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            s.push(str.charAt(i));
        }

        String str1="";
        while(!s.isEmpty()){
            str1+=s.pop();
        }

        if(str.equals(str1)){
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {

        String str="nayan";
        System.out.println(isCheck(str));
    }
}
