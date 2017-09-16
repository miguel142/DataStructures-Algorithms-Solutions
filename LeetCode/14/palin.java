
import java.util.*;

public class palin {

    public static void main(String[] args) {

       String[] array = {"theteaher", "thestudent", "theparent"};

       String pre = prefix(array);

       System.out.println(pre);


    }


    //Answer  O(nk^2)  k is the average length of strings

    public static String prefix(String[] array){

        String pre = "";

        for(int i = 0; i < array[0].length(); i++){
            char temp = array[0].charAt(i);

            for(int j = 0; j < array.length; j++){

                if(temp != array[j].charAt(i)){
                    return pre;
                }
            }

            pre += temp;
        }

        return pre;

    }
}












