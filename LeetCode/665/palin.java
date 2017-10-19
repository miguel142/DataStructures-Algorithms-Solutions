
import java.util.*;

public class palin {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 7, 6, 8, 7};
        System.out.println(decreasing(array));

    }



    public static boolean decreasing(int[] array) {

        if(array == null || array.length == 0 || array.length == 1){
            return false;
        }


        int count = 0;

        for(int i = 1; i < array.length; i++){

            if(array[i - 1] > array[i]){
                ++count;
            }
        }

        if(count > 1){
            return false;
        }

        return true;

    }


}













