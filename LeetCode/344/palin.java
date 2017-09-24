
import java.util.*;

public class palin {

    public static void main(String[] args) {

        String str = "Hello";

        str = merge(str);

        System.out.println(str);



    }


    //Answer  O(n) time 0(1) space

    public static String merge(String str) {

        char[] array = str.toCharArray();
        int front = 0;
        int end = array.length - 1;

        while(front < end){
            char temp = array[front];
            array[front] = array[end];
            array[end] = temp;

            ++front;
            --end;
        }

        String newStr = String.valueOf(array);

        return newStr;

    }
}












