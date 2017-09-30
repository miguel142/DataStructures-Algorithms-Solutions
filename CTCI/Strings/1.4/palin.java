
import java.util.*;

public class palin {

    public static void main(String[] args) {


        String str = "heaaareh";

       System.out.println(palindrome(str));



    }


    //Answer  O(n) time 0(1) space

    public static boolean palindrome(String str) {

        char[] array = str.toCharArray();
        int[] table = new int[128];
        int count = 0;

        for(int i = 0; i < array.length; i++){

            if(array[i] != ' ') {
                table[array[i]]++;

                if (table[array[i]] % 2 == 1) {
                    ++count;
                } else {
                    --count;
                }
            }

            else{
                //do nothing
            }
        }

        if(count > 1){
            return false;
        }

        return true;


    }


}















