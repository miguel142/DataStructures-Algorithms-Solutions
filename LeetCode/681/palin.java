
import java.util.*;

public class palin {

    public static void main(String[] args) {

        String str = "23:58";
        
        System.out.println(check(str));


    }

    public static String check(String time) {

        HashSet<Character> set = new HashSet<>();

        set.add(time.charAt(0));
        set.add(time.charAt(1));
        set.add(time.charAt(3));
        set.add(time.charAt(4));

        String hour = time.substring(0, 2);
        String min = time.substring(3,5);
        boolean check = true;

        String curr = String.valueOf(hour+':'+min);

        while(check){

             hour = curr.substring(0, 2);
             min = curr.substring(3,5);

            int tmin = Integer.parseInt(min);
            int thour = Integer.parseInt(hour);


            tmin += 1;

            if(tmin == 60){
                tmin = 0;

                thour += 1;

                if(thour == 24){
                    thour = 0;
                }
            }

            StringBuilder build = new StringBuilder();

            if(thour <= 9) {
                build.append('0');
            }

            build.append(thour);

            build.append(':');


            if(tmin <=9) {
                build.append('0');

            }

            build.append(tmin);

            curr = build.toString();

            System.out.println(curr);

            if(set.contains(curr.charAt(0)) && set.contains(curr.charAt(1)) &&
                    set.contains(curr.charAt(3)) && set.contains(curr.charAt(4))){
                System.out.println(curr + "answer");
                check = false;
            }

        }

        System.out.println(curr);

        return curr;

    }


}













