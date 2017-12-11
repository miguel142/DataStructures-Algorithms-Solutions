import java.lang.reflect.Array;
import java.util.*;

// “hello” => “ellohay” - given a word that starts with a consonant, move the first letter to the end and add ‘ay’
//apples” => “applesay” - given a word that starts with a vowel, add ‘ay
//“eat world” => “eatay orldway” - given a phrase, translate all of the words in the phrase
//“Hello” => “Ellohay” - given a capitalized word starting with a consonant, preserve the capitalization
//“Eat” => “Eatay” - given a capitalized word starting with a vowel, preserve the capitalization
//“hello... world?!” => “ellohay... orldway?!” (note 2 spaces after period) - given a sentence with punctuation, translate all of the words and preserve the non-word characters
public class question {



    public static void main (String args[]){


        int[] arr = {0, 1, 2, 4, 5, 7};

        System.out.println(ranges(arr));

    }

    public static String[] ranges(int[] arr){

        ArrayList<String> list = new ArrayList<>();
        StringBuilder build = new StringBuilder();
        int nextInt = arr[0] + 1;
        build.append(String.valueOf(arr[0]) + "");
        boolean check = false;

        for(int i = 1; i < arr.length; i++){

            if(arr[i] != nextInt){

                if(check) {
                    build.append("->" + String.valueOf(arr[i - 1]));
                }

                list.add(build.toString());

                build = new StringBuilder();

                build.append(String.valueOf(arr[i]) + "");

                check = false;

                nextInt = arr[i] + 1;

            }
            else{
                check = true;
                nextInt = nextInt + 1;

            }

        }

        if(check){
            build.append("->" + String.valueOf(arr[arr.length - 1]));
        }

        list.add(build.toString());




       return list.toArray(new String[list.size()]);


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
