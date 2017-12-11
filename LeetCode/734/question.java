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


        String[] word1 = {"great", "acting", "skills"};
        String[] word2 = {"fine", "drama", "yes"};
        String[][] arr = {{"great", "fine"}, {"acting", "drama"}, {"skills", "talent"}};
        System.out.println(solution(word1, word2, arr));
    }

    public static boolean solution(String[] words1, String [] words2, String[][] pairs){

       if(words1.length != words2.length){
           return false;
       }

       int count = 0;
       HashMap<String, String> map = new HashMap<>();

       for(int i = 0; i < pairs.length; i++){

           map.put(pairs[i][0], pairs[i][1]);
       }


       for(int i = 0; i < words1.length; i++){

            if(map.containsKey(words1[i])){

                for(int j = 0; j < words2.length; j++){

                    if(map.get(words1[i]) == words2[j]){
                        ++count;
                    }

                }
            }
        }

        for(int i = 0; i < words2.length; i++){

            if(map.containsKey(words2[i])){

                for(int j = 0; j < words1.length; j++){

                    if(map.get(words2[i]) == words1[j]){
                        ++count;
                    }

                }
            }
        }

        if(count == pairs.length){
            return true;
        }

        return false;

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
