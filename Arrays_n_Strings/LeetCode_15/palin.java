
import java.util.*;

public class palin {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 2, 3, 1, 3, 2};

        ArrayList list = threeSum(array, 6);

        System.out.println(list);

    }

    //Answer

    public static ArrayList threeSum(int[] array, int sum){

        Arrays.sort(array);
        ArrayList<ArrayList> bigList = new ArrayList<ArrayList>();

        HashSet set = new HashSet();

        for(int i = 0; i < array.length; i++){

            int counter = sum - array[i];
            int low = i + 1;
            int high = array.length - 1;

            while(low < high){

                if(array[low] + array[high] == counter){
                    ArrayList tempList = new ArrayList();
                    tempList.add(array[i]);
                    tempList.add(array[low]);
                    tempList.add(array[high]);
                    bigList.add(tempList);

                    while(low < high && array[low] == array[low + 1]) ++low;
                    while(low < high && array[high] == array[high - 1]) --high;

                    ++low; --high;

                }

                else if(array[low] + array[high] > counter){
                    --high;
                }

                else if(array[low] + array[high] < counter){
                    ++low;
                }
            }

        }

        return bigList;


    }

}
