
import java.util.*;

public class palin {

    public static void main(String[] args) {

        String str = "Helllo";
        String str2 = "Helloe";

        System.out.println(unique(str, str2));



    }


    //Answer  O(n) time 0(1) space

    public static boolean unique(String str1, String str2) {

        if(str1.length() != str2.length()) return false;

        int[] letters = new int[128];

        for(int i = 0; i < str1.length(); i++){
            letters[str1.charAt(i)]++;
        }

        for(int i = 0; i < str2.length(); i++){
            letters[str2.charAt(i)]--;
            if(letters[str2.charAt(i)] < 0){
                return false;
            }
        }

        return true;

    }


}
















