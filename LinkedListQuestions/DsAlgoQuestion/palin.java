
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

        Node newList = reverseList(head);

        while(newList != null){
            System.out.println(newList.data);
            newList = newList.next;
        }



    }
    
    //Answer

    public static Node reverseList(Node originalH){
        Node head = originalH;
        Node newHead = null;

        while(head != null){
            Node temp = new Node(head.data);

            temp.next = newHead;
            newHead = temp;

            head = head.next;

        }

        return newHead;

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

