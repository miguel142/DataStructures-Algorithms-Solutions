
import java.util.*;

public class palin {

    public static void main(String[] args) {

       System.out.println(compress("aaaccd"));
    }


    //Answer  O(n) time 0(1) space

    public static String compress(String str) {

        char[] array = str.toCharArray();
        StringBuilder comp = new StringBuilder();

        char curr = array[0];
        int counter = 1;

        for(int i = 1; i < array.length; i++){
            if(array[i] != curr){
                comp.append(curr);
                comp.append(Integer.toString(counter));

                curr = array[i];
                counter = 1;
            }

            else{
                ++counter;
            }
        }

        comp.append(curr);
        comp.append(Integer.toString(counter));

        if(comp.length() > str.length()){
            return str;
        }

        return comp.toString();
    }

}












