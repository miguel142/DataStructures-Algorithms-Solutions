
import java.util.*;

public class palin {

    public static void main(String[] args) {

       System.out.println(palindrome("hello", "hel"));



    }


    //Answer  O(n) time 0(1) space

    public static boolean palindrome(String str1, String str2) {

        boolean check;

        if(str1.length() % str2.length() != 1 && str1.length() != str2.length()){
            return false;
        }


        if(str1.length() > str2.length()){
            check = addEdit(str1, str2);
            return check;
        }

        if(str1.length() < str2.length()){
            check = addEdit(str2, str1);
            return check;
        }

        if(str1.length() == str2.length()){
            check = same(str1, str2);
            return check;
        }


        return false;

    }

    public static boolean addEdit(String first, String second){

        int count = 0;
        int diff = 0;
        char[] fir = first.toCharArray();
        char[] sec = second.toCharArray();

        for(int i = 0; i < second.length(); i++){

            if(fir[count] != sec[i]){
                ++diff;
                --i;
            }
            ++count;
        }

        if(diff > 1){
            return false;
        }


        return true;


    }

    public static boolean same(String first, String second){
        

        int diff = 0;

        for(int i = 0; i < first.length(); i++){

            if(first.charAt(i) != second.charAt(i)){
                ++diff;
            }
        }

        if(diff > 1){
            return false;
        }

        return true;
    }

}












