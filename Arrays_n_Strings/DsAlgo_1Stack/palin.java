
import java.util.*;

public class palin {
    public static void main(String[] args) {
        
        int[] array = {6, 4, 1, 5, 3, 8};

         nextElement(array);


    }

    //Answer

    public static void nextElement(int[] array){

        int[] newArray = new int[array.length];
        int temp;
        int pointer;


        for(int i = 0; i < array.length - 1; i++){
            pointer = i + 1;

            while(pointer < array.length - 1) {

                if(array[i] > array[pointer]){
                    break;
                }

                ++pointer;

            }

            if(array[i] > array[pointer]){
                newArray[i] = array[pointer];
            }
            else{
                newArray[i] = 0;
            }

        }

    }

    //Answer

}


