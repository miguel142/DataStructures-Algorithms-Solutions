
import java.util.*;

public class palin {

    public static void main(String[] args) {
        String str = "Heehh";
        String str3 = "Bttbc";

        boolean check = ismorph(str, str3);

        System.out.println(check);
        


    }


    //Answer  O(n) time 0(1) space

    public static boolean ismorph(String str1, String str2) {

        if(str1 == null || str2 == null){
            return false;
        }

        if(str1.length() != str2.length()){
            return false;
        }

        HashMap<Character, Character> map = new HashMap<Character, Character>();
        char[] array1 = str1.toCharArray();
        char[] array2 = str2.toCharArray();


        for(int i = 0; i < str1.length(); i++){

            if(map.containsKey(array1[i])){

                if(map.get(array1[i]) != array2[i]){
                    return false;
                }

            }

            else{
                map.put(array1[i], array2[i]);
            }
        }

        return true;
    }


}













