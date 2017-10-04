
import java.util.*;

public class palin {

    public static void main(String[] args) {

        System.out.println(subAtromic("01 69"));

    }


    public static boolean subAtromic(String str){

        if(str == null){
            return false;
        }

        String check = "001169688 ";

        for(int i = 0; i < str.length(); i++){

            if(!check.contains(str.charAt(i) + "")){
                return false;
            }
        }

        return true;

    }

}















