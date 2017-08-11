
import java.util.*;

public class palin {

    public static void main(String[] args) {

        String par = "()()()[()}";
        boolean check = validPar(par);
        System.out.println(check);
    }

    //Answer

    public static boolean validPar(String orig){

        char[] array = orig.toCharArray();
        Stack<Character> st = new Stack<Character>();

        for(int i = 0; i < array.length; i++){
            if(array[i] == '('){
                st.push(')');
            }
            else if(array[i] == '{'){
                st.push('}');
            }
            else if(array[i] == '['){
                st.push(']');
            }
            else if(st.isEmpty() ||  st.pop() != array[i]){
               return false;
            }
        }

        return st.isEmpty();
    }

    //Answer

}






class Node{
    Node next = null;
    int data;

    Node(int data){
        this.data = data;
        this.next = next;
    }
}

