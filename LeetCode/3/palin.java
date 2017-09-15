
import java.util.*;

public class palin {

    public static void main(String[] args) {

        String longest = "yesyplease";

        longest = longSub(longest);

        System.out.println(longest);

    }


    //Answer

    public static String longSub(String str){
        char[] array = str.toCharArray();
        String maxSub = "";



        for(int i = 0; i < array.length; i++){
            HashSet<Character> set = new HashSet<Character>();
            String temp = "";

            for(int j = i; j < array.length; j++){

                if(set.contains(array[j])){


                    if(maxSub.compareTo(temp) < 0){
                        System.out.println("yes");
                        maxSub = temp;

                    }

                    break;
                }

                else if(j == array.length - 1){
                    temp += array[j];

                    if(maxSub.compareTo(temp) < 0){
                        maxSub = temp;
                    }

                    break;
                }

                else{

                    set.add(array[j]);
                    temp += array[j];
                }
            }
        }

        return maxSub;

    }

    //O(n^2)




}

















