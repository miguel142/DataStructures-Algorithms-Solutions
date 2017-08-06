
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

      String str = "abcaefghia";

      int num = subStr(str);

      System.out.println(num);

    }

    //Answer

    public static int subStr(String str) {
        char[] array = str.toCharArray();
        HashSet set = new HashSet();
        int counter = 0;
        int maxSize = 0;

        for(int i = 0; i < array.length; i++){

            if(set.contains(array[i])){

                if(counter > maxSize){
                    maxSize = counter;
                }

                counter = 1;
            }

            else{
                set.add(array[i]);
                ++counter;
            }
        }

        return maxSize;

    }

    //Answer

    //Answer





//    public static char[] swap(char[] word, int front, int back){
//
//    }



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

