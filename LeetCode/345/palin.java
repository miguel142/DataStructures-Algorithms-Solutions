
import java.util.*;

public class palin {

    public static void main(String[] args) {

        String str = "Yesourr";
        System.out.println(square(str));

    }


    //Answer  O(n) time 0(1) space

    public static String square(String str) {

        char[] array = str.toCharArray();
        int front = 0;
        int end = str.length() - 1;
        String table = "aeiou";

        while(front < end){

            if(!table.contains(array[end] + "")){
                --end;
                System.out.println("if");
            }

            else if(!table.contains(array[front] + "")){
                ++front;
                System.out.println("else if");
            }

            else{
                char temp = array[front];
                array[front] = array[end];
                array[end] = temp;
                ++front;
                --end;
                System.out.println("else");
            }

        }

        str = String.valueOf(array);

        return str;
    }
}












