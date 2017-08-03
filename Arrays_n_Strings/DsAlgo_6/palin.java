
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

        int[] array = {0, 0, 1, 5, 0, 3};

         moveZeros(array);


    }

    //Answer

    public static void moveZeros(int[] array){
        int frontPointer = 0;
        int backPointer = array.length - 1;

        while(frontPointer < backPointer){

            if(array[frontPointer] == 0 && array[backPointer] != 0) {
                array = swap(array, frontPointer, backPointer);
                ++frontPointer;
                --backPointer;
            }

            else {
                if (array[frontPointer] != 0) {
                    ++frontPointer;
                }
            }
                if (array[backPointer] == 0){
                    --backPointer;
                }

        }

        for(int i =0; i < array.length; i++){
            System.out.println(array[i]);
        }

    }
    //Answer


    public static int[] swap(int[] array, int front, int back){
        int temp = array[back];
        array[back] = 0;
        array[front] = temp;

        return array;

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

