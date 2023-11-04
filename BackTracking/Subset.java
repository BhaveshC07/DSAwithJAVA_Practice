package BackTracking;

public class Subset {
    public static void main  (String[] args) {
        String str="abc";
        newArr(str," ",0);
    }
    public static void newArr(String str,String ans,int i ){
        if(i==str.length()){
            System.out.println(ans);
            return;
        }
        newArr(str,ans+str.charAt(i),i+1);
        newArr(str,ans,i+1);

    }
}
