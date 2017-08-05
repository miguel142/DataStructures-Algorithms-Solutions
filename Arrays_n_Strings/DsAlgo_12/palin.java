
import java.util.*;

public class palin {
    public static void main(String[] args) {

//        Node head = new Node(9);
//        addNode(head, 8);
//        addNode(head, 7);
//        addNode(head, 6);
//        addNode(head, 5);
//        addNode(head, 4);
//        addNode(head, 3);
//        addNode(head, 2);
//        addNode(head, 1);
//
//        Node newList = lastNode(head, 3);
//
//        System.out.println(newList.data);

//        while(newList != null){
//            System.out.println(newList.data);
//            newList = newList.next;
//        }

        String array = "backwards sentence Hello";

        array = reverse(array);

        System.out.println(array);


    }

    //Answer

    public static String reverse(String array){
        if(array == null ){
            System.out.println("Out of bounds");

            return array;
        }

        char[] charArray = array.toCharArray();
        charArray = swap(charArray, 0, charArray.length - 1);

        int i = 0;
        int front = 0;
        int back = 0;

        while(i < charArray.length){
            if(charArray[i] == ' '){
                charArray = swap(charArray, front, back);
                front = i + 1;
                back = front;
            }

            else{
                back = i;
            }

            i++;
        }

        charArray = swap(charArray, front, back);

        String str = new String(charArray);

        return str;



    }


    public static char[] swap(char[] word, int front, int back){
        int i = front;
        int j = back;

        while(i < j){
            char temp = word[i];
            word[i] = word[j];
            word[j] = temp;

            ++i;
            --j;

        }

        return word;
    }

    //Answer

    //Answer

    //Answer

//
//    public static void addNode(Node head, int data){
//        Node temp = head;
//        while(temp.next != null){
//            temp = temp.next;
//        }
//
//        temp.next = new Node(data);
//    }





}


//class Node{
//    Node next = null;
//    int data;
//
//    Node(int data){
//        this.data = data;
//        this.next = next;
//    }
//}

