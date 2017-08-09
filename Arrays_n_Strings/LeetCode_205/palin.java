
import java.util.*;

public class palin {

    public static void main(String[] args) {

        String word1 = "thee";
        String word2 = "resd";
        boolean check = isomorphic(word1, word2);

        System.out.println(check);

    }

    //Answer

    public static boolean isomorphic(String string1, String string2){

        char[] str1 = string1.toCharArray();
        char[] str2 = string2.toCharArray();
        HashMap<Character, Character> map = new HashMap<Character, Character>();

        for( int i = 0; i < str1.length; i++ ){

            if(map.containsKey(str1[i])){

                if(map.get(str1[i]) != str2[i]){
                    return false;
                }
            }

            else{
                map.put(str1[i], str2[i]);
            }

        }

        return true;

    }


}

