
import java.util.*;

public class palin {

    public static void main(String[] args) {

        System.out.println(stringM("abcd", "cdabgdab"));

    }


    //Answer  O(n) time 0(1) space

    public static int stringM(String A, String B) {

        if(A == null || B == null){
            System.out.println("Invalid");
            return -1;
        }

        int divide = B.length() /A.length() + 1;
        StringBuilder build = new StringBuilder();

        for(int i = 0; i < divide; i++){
            build.append(A);
        }

        String newStr = build.toString();

        if(!newStr.contains(B)){
            return -1;
        }

        return divide;

    }
}

