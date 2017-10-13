
import java.util.*;

public class palin {

    public static void main(String[] args) {


        int[] array = {1, 4, 2, 3};
        System.out.println(check(array, 1));


    }

    public static int check(int[] array, int k) {


        for(int i = 0; i < array.length - 1; i++){
            HashSet<Integer> set = new HashSet<>();

            for(int c = i; c < array.length; c++){
                set.add(c + 1);
            }

            set.remove(array[i]);

            for(int j = i + 1; j < array.length; j++){
                set.remove(array[j]);

                int between = Math.abs(array[i] - array[j]) - 1;

                if(between == k){

                    Iterator iter = set.iterator();
                    int max = Math.max(array[i], array[j]);
                    int low = Math.min(array[i], array[j]);
                    int count = between;

                    while(iter.hasNext()){
                        int curr = (int) iter.next();
                        if(curr > low && curr < max){
                            --count;
                        }

                        if(count == 0){
                            return j + 1;
                        }
                    }
                }
            }
        }

        return 0;

    }

}














