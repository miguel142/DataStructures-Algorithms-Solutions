
import java.util.*;

public class palin {

    public static void main(String[] args) {

        System.out.println(permuPalin("adds"));

    }


    //Answer  O(n) time 0(1) space

    public static boolean permuPalin(String str) {

        int[] table = new int[128];
        int countOdd = 0;
        char[] array = str.toCharArray();

        for(int i = 0; i < array.length; i++){

            table[array[i]]++;

            if(table[array[i]] % 2 == 1){
                ++countOdd;
            }

            else{
                --countOdd;
            }
        }

        if(countOdd > 1){
            return false;
        }

        return true;

    }
}







//
//class Node{
//    int data;
//    Node left;
//    Node right;
//    Node parent;
//
//    Node(int data){
//        this.data = data;
//        left = right = parent = null;
//    }
//
//
//}












