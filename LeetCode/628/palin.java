
import java.util.*;

public class palin {

    public static void main(String[] args) {


        int[] arr = {1, 2, 3};

        System.out.println(degreeOfArray(arr));


    }



    public static int degreeOfArray(int[] arr){

        int one = 0;
        int two = 0;
        int thr = 0;


        for(int i = 0; i < arr.length; i++){

            if(one < arr[i] || two < arr[i] || thr < arr[i]){

                if(one < arr[i]){
                    thr = two;
                    two = one;
                    one = arr[i];
                }
                else if(two < arr[i]){
                    thr = two;
                    two = arr[i];
                }
                else if(thr < arr[i]){
                    thr = arr[i];
                }
            }
        }


        return one * two * thr;


    }

}













