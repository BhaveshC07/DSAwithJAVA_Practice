package Arrays;
public class subArray {
    public static void main(String[] args) {
        int num[]={1,3,5,7,9,2,4,6,8};
        Sarray(num);
    }
    public static void Sarray(int[] num){
        for (int i = 0; i < num.length; i++) {
            for (int j = i; j < num.length; j++) {
                for (int k = i; k <=j ; k++) {
                    System.out.print(num[k]+",");
                }
                System.out.println();
            }
        }
    }
}