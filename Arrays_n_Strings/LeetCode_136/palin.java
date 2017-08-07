
import java.util.*;

public class palin {

    public static void main(String[] args) {

        int[] array = {1, 1, 2, 3, 3, 4, 4};
        HashSet list = duplicates(array);

        System.out.println(list);

    }

    //Answer

    public static HashSet duplicates(int[] array) {

      HashSet set = new HashSet();

      for(int i = 0; i < array.length; i++){
          if(set.contains(array[i])){
              set.remove(array[i]);
          }
          else{
              set.add(array[i]);
          }
      }
        return set;


    }

    //Answer
}


