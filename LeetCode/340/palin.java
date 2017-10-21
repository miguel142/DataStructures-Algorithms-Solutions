
import java.util.*;

public class palin {

    public static void main(String[] args) {

        System.out.println(distinct("eceeecba", 2));

    }



    public static int distinct(String s, int k) {

        int max = 0;

        for(int i = 0; i < s.length(); i++){
            HashSet<Character> set = new HashSet<>();
            int dist = 0;
            int len = 0;

            for(int j = i; j < s.length(); j++){
                if(!set.contains(s.charAt(j))){
                    ++dist;
                    set.add(s.charAt(j));

                    if(dist > 2){

                        if(max < len){
                            max = len;
                        }
                        break;
                    }
                }

                ++len;
            }
        }

        return max;
    }

}














