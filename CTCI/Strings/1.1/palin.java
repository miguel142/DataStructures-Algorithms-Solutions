
import java.util.*;

public class palin {

    public static void main(String[] args) {

        String str = "Helo";
        String str2 = "Hello";

        System.out.println(unique(str));
        System.out.println(unique(str2));


    }


    //Answer  O(n) time 0(1) space

    public static boolean unique(String str) {

        if(str.length() > 128) return false;
        boolean[] check = new boolean[128];
        char[] array = str.toCharArray();

        for(int i = 0; i < array.length; i++){

            if(check[array[i]]){
                return false;
            }

            else{
                check[array[i]] = true;
            }
        }

        return true;

    }


}















