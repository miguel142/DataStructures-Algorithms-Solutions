
import java.util.*;

public class palin {

    public static void main(String[] args) {
        System.out.println(reverseSent("the revolution will not be televised"));

    }


    public static String reverseSent(String str) {

        StringBuilder build = new StringBuilder();
        StringBuilder temp = new StringBuilder();
        char[] arr = str.toCharArray();

        for(int i = 0; i < arr.length; i++){

            if(arr[i] == ' ' ){
                build.append(temp.reverse().toString() + " ");
                temp = new StringBuilder();
            }
            else if(i == arr.length - 1){
                temp.append(arr[i]);
                build.append(temp.reverse().toString());
            }
            else{
                temp.append(arr[i]);
            }

        }

        return build.toString();

    }

}








class Node{
    int data;
    Node left;
    Node right;

    Node(int data){
        this.data = data;
        left = right = null;
    }


}















