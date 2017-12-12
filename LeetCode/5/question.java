import java.lang.reflect.Array;
import java.util.*;

//Elon Musk was made fun of, people didnt want to hire him, and people doubted him
//Kid Cudi suffered through depression, but he didnt give up and he became Kid Cudi

public class question {



    public static void main (String args[]){


        System.out.println(longestCommon("cbbd"));

    }

    public static String longestCommon(String str){

        char[] arr = str.toCharArray();
        String longestPalin = "";


        for(int i = 0; i < arr.length; i++){

            for(int j = arr.length - 1; j > i; j--){

                if(arr[i] == arr[j]){

                    if(check(arr, i, j)){
                        String temp = str.substring(i, j + 1);

                        if(longestPalin.length() < temp.length()) {
                            longestPalin = temp;
                        }
                    }
                }
            }
        }

        return longestPalin;

    }

    public static boolean check(char[] arr, int i, int j){

        while(i < j){

            if(arr[i] != arr[j]){
                return false;
            }

            i++;
            j--;
        }

        return true;
    }










//
//    public static String pigLatin(String word){
//
//        String[] arrWords = word.split(" ");
//        StringBuilder ans = new StringBuilder();
//
//        HashSet<Character> set = new HashSet<>();
//        set.add('a');
//        set.add('e');
//        set.add('i');
//        set.add('o');
//        set.add('u');
//
//        for(int i = 0; i < arrWords.length; i++) {
//
//
//            StringBuilder build = new StringBuilder();
//            char tempChar = arrWords[i].charAt(0);
//
//            if (!set.contains(Character.toLowerCase(tempChar))) {
//                build = notVowel(build, arrWords[i]);
//
//            } else {
//                build.append(arrWords[i]);
//            }
//
//            build.append("ay");
//            ans.append(build.toString());
//
//            if(i != arrWords.length - 1){
//                ans.append(" ");
//            }
//
//        }
//
//        return ans.toString();
//    }
//
//    public static StringBuilder notVowel(StringBuilder build, String arrWords){
//
//        char tempChar = arrWords.charAt(0);
//        char secondChar = arrWords.charAt(1);
//
//        if(Character.isUpperCase(tempChar)){
//            build.append(Character.toUpperCase(secondChar));
//        }
//        else{
//            build.append(secondChar);
//        }
//
//        String temp = arrWords.substring(2, arrWords.length());
//        build.append(temp);
//        build.append(Character.toLowerCase(tempChar) + "");
//
//
//        return build;
//    }





}
