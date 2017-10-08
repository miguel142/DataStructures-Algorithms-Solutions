
import java.util.*;

public class palin {

    public static void main(String[] args) {


        int[][] matrix = {{0, 1, 0, 0},
                            {1, 1, 1, 0},
                             {0, 1, 0, 0},
                            {1, 1, 0, 0}};

        System.out.println(check(matrix));


    }

    public static int check(int[][] matrix) {

        int neighbors = 0;
        int fences = 0;

        for(int i = 0 ; i < matrix.length; i++){

            for(int j = 0; j < matrix[i].length; j++){

                if(matrix[i][j] == 1){
                    ++fences;

                    if(i < matrix.length - 1 && matrix[i + 1][j] == 1){
                        ++neighbors;
                    }

                    if(j < matrix[i].length - 1 && matrix[i][j + 1] == 1){
                        ++neighbors;
                    }
                }
            }
        }

        return fences * 4 - neighbors * 2;

    }
}












