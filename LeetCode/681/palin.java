
import java.util.*;

public class palin {

    public static void main(String[] args) {

        System.out.println(subAtromic("abcd", "cdabcdabcda"));

    }


    public static int subAtromic(String A, String B){

        if(A == null || B == null){
            System.out.println("Invalid");
            return -1;
        }

        int count = 0;

        if(B.charAt(0) != 'a'){
            ++count;
        }

        for(int i  = 0; i < B.length(); i++){

            if(B.charAt(i) == 'a'){
                for(int j = i; j < B.length(); j++){
                    if(B.charAt(j) == 'd'){
                        ++count;
                        i = j;
                        break;
                    }
                }
            }
        }

        if(B.charAt(B.length() - 1) != 'd'){
            ++count;
        }

        if(B.charAt(0) == 'a' && B.charAt(B.length() - 1) == 'd'){
            ++count;
        }

        StringBuilder build = new StringBuilder();

        for(int i = 0; i < count; i++){
            build.append(A);
        }

        String newStr = build.toString();

        if(!newStr.contains(B)){
            return -1;
        }

        return count;
    }


}













