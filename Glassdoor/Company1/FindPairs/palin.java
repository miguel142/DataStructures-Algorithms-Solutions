
import java.util.*;

public class palin {

    public static void main(String[] args) {


        int[] arr = {5, 2, 4, 7, 6};

        System.out.println(commonSub(arr));


    }



    public static ArrayList<ArrayList<Integer>> commonSub(int[] arr){

        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();

        Arrays.sort(arr);

        for(int i = 0; i < arr.length; i++){
            twoSum(ans, arr, arr[i]);
        }

        return ans;
    }

    public static void twoSum(ArrayList<ArrayList<Integer>> list, int[] arr, int sum){

        int low = 0;
        int high = arr.length - 1;


        while(low < high){

            if(arr[low] + arr[high] == sum){
                ArrayList<Integer> temp = new ArrayList<>();
                temp.add(arr[low]);
                temp.add(arr[high]);
                list.add(temp);
                ++low;
                --high;
            }
            else if(arr[low] + arr[high] < sum){
                ++low;
            }
            else{
                --high;
            }
        }
    }

}













