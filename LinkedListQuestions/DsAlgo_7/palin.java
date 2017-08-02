
import java.util.*;

public class palin {
    public static void main(String[] args) {

        Node head = new Node(9);
        addNode(head, 8);
        addNode(head, 7);
        addNode(head, 6);
        addNode(head, 5);
        addNode(head, 4);
        addNode(head, 3);
        addNode(head, 2);
        addNode(head, 1);

        Node newList = lastNode(head, 3);

        System.out.println(newList.data);

//        while(newList != null){
//            System.out.println(newList.data);
//            newList = newList.next;
//        }



    }

    //Answer

    public static Node lastNode(Node head, int k){

        Node fastPointer = head;
        Node slowPointer = head;
        int counter = 0;

        while(fastPointer != null && counter < k){
            fastPointer = fastPointer.next;
            ++counter;
        }

        while(fastPointer != null){
            fastPointer = fastPointer.next;
            slowPointer = slowPointer.next;
        }

        return slowPointer;


    }

    //Answer


    public static void addNode(Node head, int data){
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }

        temp.next = new Node(data);
    }





}


class Node{
    Node next = null;
    int data;

    Node(int data){
        this.data = data;
        this.next = next;
    }
}

