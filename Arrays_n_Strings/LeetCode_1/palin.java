
import java.util.*;

public class palin {
    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 5, 6, 7, 10, 20, 21};
        int[] indexes = twoSums(nums, 10);


        System.out.println(nums[indexes[0]] + " " + nums[indexes[1]]);


    }

    //Answer

    public static int[] twoSums(int[] array, int target){
        if(array == null){
            return array;
        }

        int frontP = 0;
        int backP = array.length - 1;

        while(frontP < backP){
            if(array[frontP] + array[backP] == target){
                int[] indexes = new int[2];
                indexes[0] = frontP;
                indexes[1] = backP;

                return indexes;
            }

            else if(array[frontP] + array[backP] > target){
                --backP;
            }

            else if(array[frontP] + array[backP] < target){
                ++frontP;
            }
        }

        System.out.println("Nothing");

        return array;
    }

    //Answer


}


