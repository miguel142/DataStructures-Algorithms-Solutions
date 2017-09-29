
import java.util.*;

public class palin {

    public static void main(String[] args) {

        String str = "He low    ";


       str =urlify(str, 5);

       System.out.println(str);



    }


    //Answer  O(n) time 0(n) space

    public static String urlify(String str, int k) {

        int size = 0;
        int spaces = 0;
        char[] array = str.toCharArray();

        for(int i = 0; i < k; i++){
            if(array[i] == ' '){
                ++spaces;
            }
        }

        size = k + spaces * 2;
        char[] real = new char[size];
        int count = 0;

        for(int i = 0; i < real.length; i++){
            if(array[count] == ' '){
                real[i] = '%';
                real[++i] = '2';
                real[++i] = '0';

            }

            else{
                real[i] = array[count];
            }
            ++count;
        }

        String newStr = String.copyValueOf(real);
        System.out.println(newStr);

        return newStr;

    }


}













