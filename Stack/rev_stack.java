package Stack;

import java.util.Stack;

public class rev_stack {
    public static void main(String[] args) {
        Stack<Integer> s =new Stack<>();
        s.push(1);
        s.push(2);
        s.push(5);
        s.push(3);

        rev(s);

        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
    public static void pushatbtm(Stack<Integer> s,int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top=s.pop();
        pushatbtm(s,data);
        s.push(top);
    }
    public static void rev(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int top=s.pop();
        rev(s);
        pushatbtm(s,top);
    }
}
