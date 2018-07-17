package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {


        System.out.println(longest("yesrrfcgtesa"));
    }

    public static String longest(String str){

        char[] arr = str.toCharArray();
        String ans = "";
        StringBuilder build = new StringBuilder();
        HashSet set = new HashSet();

        for(int i = 0,j = 0;i < arr.length; i++){

            if(set.contains(arr[i])){
                j = 1;

                if(ans.length() < build.toString().length()){

                    ans = build.toString();
                }

                build = new StringBuilder();
                set.clear();
                --i;
            }

            else if(i == arr.length -1){
                build.append(arr[i]);

                if(ans.length() < build.toString().length()){
                    ans = build.toString();
                }

            }

            else{
                set.add(arr[i]);
                build.append(arr[i]);
            }

        }

        return ans;
    }
}
