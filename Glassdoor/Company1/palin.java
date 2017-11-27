
import java.util.*;

public class palin {

    public static void main(String[] args) {


        String first = "thebeachisbette";
        String second = "beachesarebette";

        System.out.println(commonSub(first, second));


    }



    public static String commonSub(String one, String two){


        String longest = "";
        char[] max;
        char[] min;

        if(one.length() < two.length()){
            max = two.toCharArray();
            min = one.toCharArray();
        }
        else{
            max = one.toCharArray();
            min = two.toCharArray();
        }

        for(int i = 0; i < max.length; i++){


            for(int j = 0; j < min.length; j++){

                if(max[i] == min[j]){

                    int left = i;
                    int right = j;

                    StringBuilder build = new StringBuilder();

                    while(left < max.length  && right < min.length){

                        if(max[left] == min[right]) {

                            build.append(max[left] + "");
                            //System.out.print("left: "+ left+ " right: "+ right);

                            ++left;
                            ++right;
                        }
                        else{
                            break;
                        }
                    }

                    String temp = build.toString();

                    if(temp.length() > longest.length()){
                        longest = temp;
                    }
                }
            }
        }

        return longest;

    }

}













