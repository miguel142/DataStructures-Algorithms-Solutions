
import java.util.*;

public class palin {
    public static void main(String[] args) {

        String array = "backwards sentence Hello";

        array = reverse(array);

        System.out.println(array);


    }

    //Answer

    public static String reverse(String array){
        if(array == null ){
            System.out.println("Out of bounds");

            return array;
        }

        char[] charArray = array.toCharArray();
        charArray = swap(charArray, 0, charArray.length - 1);

        int i = 0;
        int front = 0;
        int back = 0;

        while(i < charArray.length){
            if(charArray[i] == ' '){
                charArray = swap(charArray, front, back);
                front = i + 1;
                back = front;
            }

            else{
                back = i;
            }

            i++;
        }

        charArray = swap(charArray, front, back);

        String str = new String(charArray);

        return str;



    }


    public static char[] swap(char[] word, int front, int back){
        int i = front;
        int j = back;

        while(i < j){
            char temp = word[i];
            word[i] = word[j];
            word[j] = temp;

            ++i;
            --j;

        }

        return word;
    }

    //Answer

}


