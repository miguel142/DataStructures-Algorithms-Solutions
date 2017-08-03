
import java.util.*;

public class palin {
    public static void main(String[] args) {

        int[] array = {0, 0, 1, 5, 0, 3};

         moveZeros(array);


    }

    //Answer

    public static void moveZeros(int[] array){
        int frontPointer = 0;
        int backPointer = array.length - 1;

        while(frontPointer < backPointer){

            if(array[frontPointer] == 0 && array[backPointer] != 0) {
                array = swap(array, frontPointer, backPointer);
                ++frontPointer;
                --backPointer;
            }

            else {
                if (array[frontPointer] != 0) {
                    ++frontPointer;
                }
            }
                if (array[backPointer] == 0){
                    --backPointer;
                }

        }

        for(int i =0; i < array.length; i++){
            System.out.println(array[i]);
        }

    }
    //Answer


    public static int[] swap(int[] array, int front, int back){
        int temp = array[back];
        array[back] = 0;
        array[front] = temp;

        return array;

    }

    //Answer


}


