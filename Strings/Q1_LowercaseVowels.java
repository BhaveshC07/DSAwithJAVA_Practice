package Strings;

public class Q1_LowercaseVowels {
    public static void main(String[] args) {
        String name="bhavesh charde";
        System.out.println("vovels are come " +vowels(name)+ " times");

    }
    public static int vowels(String name){
        int count=0;
        for (int i = 0; i < name.length(); i++) {
           char k=name.charAt(i);
            if (k == 'a' || k == 'e' || k == 'i' || k == 'o' || k == 'u') {
                count++;
            }
        }
        return count;
    }
}
