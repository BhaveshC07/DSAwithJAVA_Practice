package Strings;

public class compression {
    public static void main(String[] args) {
        String s="aaabbcccdd";
        System.out.println(count(s));
    }
    public static String count(String str){
        String newstr="";
        for (int i = 0; i < str.length(); i++) {
            Integer count=1;
            while (i<str.length()-1&&str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }newstr+=str.charAt(i);
            if(count>1){
                newstr+=count.toString();
            }
            }
        return newstr;
    }
}
