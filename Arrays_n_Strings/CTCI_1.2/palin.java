
import java.util.*;

public class palin {

    public static void main(String[] args) {

        String str1 = "word";
        String str2 = "dors";

        boolean list = permutation(str1, str2);

        System.out.println(list);

    }

    //Answer

    public static boolean permutation(String str1, String str2){

        HashSet set = new HashSet();

        char[] string1 = str1.toCharArray();
        char[] string2 = str2.toCharArray();

        for(int i = 0; i < str1.length(); i++ ){
            set.add(string1[i]);
        }

        for(int j = 0; j < str2.length(); j++){
            if(!set.contains(string2[j])){
                return false;
            }
        }

        return true;


    }

    //Answer


