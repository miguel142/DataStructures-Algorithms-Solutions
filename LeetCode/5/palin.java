
import java.util.*;

public class palin {

    public static void main(String[] args) {

        String longest = "yeesyey";
        String temp = longPalin(longest);


        //longest = longSub(longest);

        System.out.println(temp);

    }


    //Answer  Brute force O(n^3)

    public static String longPalin(String str){

        char[] array = str.toCharArray();
        String max = "";


        for(int i = 0; i < array.length; i++){

            for(int j = array.length - 1; j > i; j--){

                if(array[i] == array[j]){

                    String temp = str.substring(i, j + 1);

                    boolean valid = check(temp);

                    if(valid){

                        if(temp.length() > max.length()){
                            max = temp;
                        }
                    }


                }

            }
        }

        return max;

    }


    public static boolean check(String str){

        char[] array = str.toCharArray();
        int front = 0;
        int end = str.length() - 1;

        while(front < end ){

            if(array[front] != array[end]){
                return false;
            }

            ++front;
            --end;
        }

        return true;


    }



}












