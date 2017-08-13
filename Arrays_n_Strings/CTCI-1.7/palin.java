
import java.util.*;

public class palin {

    public static void main(String[] args) {

        int[][] matrix = {{1,2,3}, {3,4,5}, {6,7,8}};

        int[][] temp = rotate(matrix);

        for(int i = 0; i < matrix.length; i++){

            System.out.println();

            for(int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j]);
            }
        }

        System.out.println();

        for(int i = 0; i < temp.length; i++){

            System.out.println();

            for(int j = 0; j < temp.length; j++) {
                System.out.print(temp[i][j]);
            }
        }


    }

    //Answer

    public static int[][] rotate(int[][] matrix){

        int[][] newArray = new int[matrix.length][matrix[0].length];

        for(int i = 0; i < matrix.length; i++){

            int[] temp = matrix[i];

            for(int j = matrix.length -1 ; j > -1; j--){

                int counter = matrix.length - 1 - j;

                 newArray[j][i] = temp[counter];
            }

        }

        return newArray;
    }





}





























