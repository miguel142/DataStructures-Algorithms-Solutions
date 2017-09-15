
import java.util.*;

public class palin {

    public static void main(String[] args) {


        String longest = "yesty";
        int temp = longSub(longest);

        System.out.println(temp);

    }


    //Answer

    public static int longSub(String str){
        char[] array = str.toCharArray();
        String maxSub = "";
        int max = 0;


        for(int i = 0; i < array.length; i++){

            int temp = 0;
            HashSet<Character> set = new HashSet<Character>();


            for(int j = i; j < array.length; j++){

                if(!set.contains(array[j]) && j != array.length - 1){
                    set.add(array[j]);
                    ++temp;
                }
                else{
                    if(!set.contains(array[j])){
                        ++temp;

                        if(temp > max){
                            max = temp;
                        }
                        break;

                    }

                    else{
                        if(temp > max){
                            max = temp;
                        }

                        break;
                    }
                }
            }
        }

        return max;

    }
    
    //O(n^2)

}














