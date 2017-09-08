
import java.util.*;

public class palin {

    public static void main(String[] args) {

       int[] array = {1, 2, 3, 5, 8};

       array = rotate(array, 2);

       for(int i = 0; i< array.length; i++){
           System.out.print(array[i] + " ");
       }



    }


    //Answer

    public static int[] rotate(int[] ar, int k){

        int[] tempAr = new int[k];
        int[] newAr = new int[ar.length];
        int j = 0;

        for(int i  = 0; i < k; i++){
            tempAr[i] = ar[i];
        }

        for(int i = 0; i < ar.length; i++){

            if(i >= k){
                newAr[j] = ar[i];
                ++j;
            }
        }

        for(int i = 0; i < tempAr.length; i++){

            newAr[j] = tempAr[i];
            ++j;
        }

        return newAr;


    }


}







