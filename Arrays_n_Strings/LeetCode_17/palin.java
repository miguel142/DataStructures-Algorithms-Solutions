
import java.util.*;

public class palin {

    public static void main(String[] args) {

        String[] phonebook = {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};


        ArrayList list = validPar(phonebook, "23");

        System.out.println(list);
    }

    //Answer

    public static ArrayList validPar(String[] book, String str){

        ArrayList<String> list = new ArrayList<String>();

        char[] digits = str.toCharArray();  //234

        for(int i = 1; i < digits.length; i++){

            char[] firstDigit = book[Character.getNumericValue(digits[0])].toCharArray(); // abc
            char[] nextDigit  = book[Character.getNumericValue(digits[i])].toCharArray(); // def, ghi, etc

            for(int j = 0; j < firstDigit.length; j++){ //for each firsD

                for(int c = 0; c < nextDigit.length; c++){ //for each nextD
                    char[] tempArray  = {firstDigit[j], nextDigit[c]};
                    String tempString = new String(tempArray);
                    list.add(tempString);
                }

            }


        }

        return list;


    }

    //Answer

}

