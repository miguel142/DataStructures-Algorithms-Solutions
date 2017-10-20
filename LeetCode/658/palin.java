
import java.util.*;

public class palin {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5};
        System.out.println(decreasing(array, 4, -1));

    }



    public static ArrayList<Integer> decreasing(int[] array, int k, int x) {

        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();

        if(x <= array[0]){
            for(int i = 0; i < k; i++){
                list.add(array[i]);
            }
            return list;
        }

        if(x >= array[array.length - 1]){
            for(int i = array.length -1; i >= 0; i--){
                list.add(array[i]);
            }
            return list;
        }

        for(int i = 0; i < array.length; i++){

            if(array[i + 1] > x){

                int front = i;
                int end = i + 1;
                int count = 0;

                System.out.println("The stop is: " + i);

                while(count < k){

                    if(front >= 0 && end <= array.length - 1){

                        if(Math.abs(array[front] - x) < Math.abs(array[end] - x)){

                            list.add(array[front]);
                            front--;
                            count++;
                        }

                        else if(Math.abs(array[front] - x) > Math.abs(array[end] - x)){
                            list.add(array[end]);
                            end++;
                            count++;
                        }

                        else if(Math.abs(array[front] - x) == Math.abs(array[end] - x)){
                            list.add(array[front]);
                            front--;
                            count++;
                        }
                    }

                    else if(end > array.length - 1){
                        list.add(array[front]);
                        front--;
                        count++;
                    }

                    else{
                        list.add(array[end]);
                        end++;
                        count++;
                    }
                    System.out.println("Front is: "+ front + " End is: "+ end );
                }

                return list;

            }
        }

        System.out.println("No list");
        return list;




    }














