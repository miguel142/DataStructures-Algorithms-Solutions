
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

            while(array[backPointer] == 0){
                --backPointer;
            }

            if(array[frontPointer] == 0){
                array = swap(array, frontPointer, backPointer);
            }

            ++frontPointer;

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


