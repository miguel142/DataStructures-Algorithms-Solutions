
import java.util.*;

public class palin {

    public static void main(String[] args) {

        System.out.println(distinct("2-4A0R7-4K", 4));

    }



    public static String distinct(String s, int k) {

        StringBuilder build = new StringBuilder();

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) != '-'){
                build.append(s.charAt(i));
            }
        }

        String str = build.toString();

        int temp = str.length() % k;

        StringBuilder strBuild = new StringBuilder();
        int j = 0;

        if(temp != 0){

            for(int i = 0; i < temp; i++){
                strBuild.append(str.charAt(i));
            }

            strBuild.append('-');

            j = temp;
        }

        int count = 0;
        
        while(j < str.length()){

            if(count < k){
                strBuild.append(str.charAt(j));
                ++count;
                ++j;
            }

            else{
                count = 0;
                strBuild.append('-');
            }
        }

        String ans = strBuild.toString();

        return ans;



    }


}












