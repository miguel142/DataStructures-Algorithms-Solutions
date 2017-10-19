
import java.util.*;

public class palin {

    public static void main(String[] args) {

        String str = "ULDR";

        System.out.println(circle(str, map));


    }



    public static boolean circle(String path, HashMap<Character, Character> map) {

        if(path.isEmpty() || path == null){
            return false;
        }

        if(path.length() % 2 != 0){
            return false;
        }

        char[] array = path.toCharArray();

        int x = 0;
        int y = 0;


        for(int i = 0; i < array.length; i++){

            if(array[i] == 'U'){
                y++;
            }
            else if(array[i] == 'D'){
                y--;
            }
            else if(array[i] == 'R'){
                x--;
            }
            else if(array[i] == 'L'){
                x++;
            }
        }

        if(x == 0 && y == 0){
            return true;
        }

        return false;


    }


}














