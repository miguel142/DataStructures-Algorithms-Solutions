
import java.util.*;

public class palin {

    public static void main(String[] args) {
        
        String par = "{}()";

        boolean check = validPar(par);

        System.out.println(check);

    }


    //Answer  O(n)

    public static boolean validPar(String str){

        if(str == null || str.length() % 2 != 0 || str.isEmpty()){
            return false;
        }

        char[] array = str.toCharArray();
        HashMap<Character, Character> map = new HashMap<>();  //() [] {}
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');

        for(int i = 0; i < array.length; i++){

            if(!map.containsKey(array[i])){
                return false;
            }

            if(array[i + 1] != map.get(array[i])){
                return false;
            }

            i++;
        }

        return true;

    }





}


