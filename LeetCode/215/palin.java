
import java.util.*;

public class palin {

    public static void main(String[] args) {

        int[] array1 = {1, 3, 4};

        int temp = kLarge(array1, 2);

        System.out.println(temp);


    }


    //Answer  O(n) time 0(1) space

    public static int kLarge(int[] array, int k) {

        Arrays.sort(array);

        int num = array[array.length - k];

        return num;

    }


}













