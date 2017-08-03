
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
        int[] array = {6, 4, 1, 5, 3, 8};

         nextElement(array);


    }

    //Answer

    public static void nextElement(int[] array){

        int[] newArray = new int[array.length];
        int temp;
        int pointer;


        for(int i = 0; i < array.length - 1; i++){
            pointer = i + 1;

            while(pointer < array.length - 1) {

                if(array[i] > array[pointer]){
                    break;
                }

                ++pointer;

            }

            if(array[i] > array[pointer]){
                newArray[i] = array[pointer];
            }
            else{
                newArray[i] = 0;
            }


        }

//        for(int i = 0; i < newArray.length; i++){
//            System.out.println(newArray[i]);
//        }

    }

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

