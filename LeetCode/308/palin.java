
import java.util.*;

public class palin {

    public static void main(String[] args) {

        int[][] matrix = {
                {1, 2, 3, 4, 5},
                {3, 4, 5, 6, 9},
                {1, 3, 5, 3, 0},
                {5, 2, 7, 1, 0}
        };

        int temp = sumRegion(matrix, 0, 0, 1,1);

        System.out.println(temp);



    }


    //Answer  O(n^2) time 0(1) space

    public static int sumRegion(int[][] matrix, int row1, int col1, int row2, int col2) {

        int sum = 0;

        for(int i = row1; i <= row2; i++){

            for(int j = col1; j <= col2; j++){
                sum += matrix[i][j];
                System.out.println(matrix[i][j]);
            }
        }

        return sum;
    }

    public static void update(int row, int col, int val, int[][] matrix){
        matrix[row][col] = val;
    }

}













