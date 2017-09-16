
import java.util.*;

public class palin {

    public static void main(String[] args) {

        String longest = "XXVI";
        HashMap<Character, Integer> map = new HashMap<>();

        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);

        int temp = roman(longest, map);

        System.out.println(temp);



    }


    //Answer  O(n)

    public static int roman(String str, HashMap<Character, Integer> map){

        int num = 0;

        num = odd(str, map);

        return num;

    }


    public static int odd(String str, HashMap<Character, Integer> map){

        char[] array = str.toCharArray();
        int sum = 0;

        for(int i = array.length - 1; i >= 0; i--){

            if(i != 0) {
                if (map.get(array[i]) > map.get(array[i - 1])) {
                    sum += map.get(array[i] - map.get(array[i - 1]));
                } else {
                    sum += map.get(array[i]) + map.get(array[i - 1]);
                }
            }

            else{
                sum += map.get(array[i]);
            }

            --i;
        }

        return sum;
    }


    }
















