package Strings;

public class Q4_Anagram {
    public static void main(String[] args) {
        String str1="earth";
        String str2="heary";

        int count=0;
        if(str1.length()==str2.length()) {
            for (int i = 0; i <str1.length(); i++) {
                char ch =str1.charAt(i);
                for (int j = 0; j < str2.length(); j++) {
                    char ch1=str2.charAt(j);
                    if(ch==ch1){
                        count++;
                    }
                }
            }
            if(count==str1.length()){
                System.out.println(str1 + " and " + str2 + " are anagrams of each" +
                        "other.");
            }else {
                System.out.println(str1 + " and " + str2 + " are not anagrams of each" +
                        "other.");
            }
        }
        else {
            System.out.println(str1 + " and " + str2 + " are not anagrams of each" +
                    "other.");
        }
    }
}
