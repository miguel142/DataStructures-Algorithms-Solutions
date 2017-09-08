
import java.util.*;

public class palin {

    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<Integer>();


        String[] array = {"the", "to", "he" , "eh"};

        ArrayList<List<String>> list1 = list(array);

        System.out.println(list1);





    }



    public static ArrayList<List<String>> list(String[] array){
        HashMap<String, List<String>> map = new HashMap<String, List<String>>();
        ArrayList<List<String>> bigList = new  ArrayList<List<String>>();

        for(int i = 0; i < array.length; i++){
            char[] temp = array[i].toCharArray();
            Arrays.sort(temp);
            String str = String.valueOf(temp);
            System.out.println(str);

            if(!map.containsKey(str)){
                map.put(str, new ArrayList<String>());
            }
            map.get(str).add(array[i]);
        }

        bigList.addAll(map.values());


        return bigList;
    }

}
















