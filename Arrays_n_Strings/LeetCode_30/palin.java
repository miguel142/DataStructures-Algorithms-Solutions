
import java.util.*;

public class palin {
    public static void main(String[] args) {

      String str = "abcd ef gh";
      String[] words = {"ab", "gh"};

      ArrayList list = subStr(str, words);


      System.out.println(list);

    }

    //Answer

    public static ArrayList subStr(String str, String[] words) {

        int wordSize = words[0].length();
        char[] array = str.toCharArray();
        ArrayList list = new ArrayList();

        for(int i = 0; i < words.length; i++){

            for(int j = 0; j < str.length(); j++){

                if(str.charAt(j) == words[i].charAt(0)){

                    String subString = str.substring(j, j + words[i].length());

                    if(subString.equals(words[i])){
                        list.add(j);
                    }

                }
            }


        }

        return list;

    }

    //Answer

}




