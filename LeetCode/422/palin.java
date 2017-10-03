
import java.util.*;

public class palin {

    public static void main(String[] args) {

        String[] str = {"abcd", "bnrt", "crm", "dt"};
        System.out.println(square(str));

    }


    //Answer  O(n) time 0(1) space

    public static boolean square(String[] str) {

        if(str == null){
            System.out.println("Invalid");
            return false;
        }


        for(int i = 0; i < str.length; i++){    //i is out column
            String row = str[i];
            StringBuilder col = new StringBuilder();

            for(int j = 0; j < str[i].length(); j++){  // j is our row

                col.append(str[j].charAt(i));
            }

            String comp = col.toString();

            if(!row.equals(comp)){
                return false;
            }
        }

        return true;

    }
}











