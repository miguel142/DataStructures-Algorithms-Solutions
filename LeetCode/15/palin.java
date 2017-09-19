
import java.util.*;

public class palin {

    public static void main(String[] args) {
        int[] array = {1, 0, 5, 2, 3};
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        list = threeSum(array, 3);

        System.out.println(list);





    }


    //Answer  O(n^3)

    public static ArrayList<ArrayList<Integer>> threeSum(int[] array, int k){

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();




        for(int i = 0; i < array.length - 1; i++){

            for(int j = i + 1; j < array.length; j++){

                int tempSum = array[i] + array[j];
                int scan = 0;

                while(scan < array.length){

                    if(scan != i && scan != j){
                        int sum = array[scan] + tempSum;

                        if(sum == k){
                            ArrayList<Integer> adder = new ArrayList<>();
                            adder.add(array[i]);
                            adder.add(array[j]);
                            adder.add(array[scan]);

                            if(!set.contains(array[i]) && !set.contains(array[j]) && !set.contains(array[scan])){
                                list.add(adder);
                                set.add(array[i]);
                                set.add(array[j]);
                                set.add(array[scan]);
                            }

                        }
                    }

                    ++scan;
                }
            }

        }

        return list;
    }





    }











