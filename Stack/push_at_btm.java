package Stack;

import java.util.Stack;

public class push_at_btm {
    public static void rec(Stack<Integer> s,int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top=s.pop();
        rec(s,4);
        s.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
         rec(s,4);

         while (!s.isEmpty()){
             System.out.println(s.pop());
         }
    }
}
