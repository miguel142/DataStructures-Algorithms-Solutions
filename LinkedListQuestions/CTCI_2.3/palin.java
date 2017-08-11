
import java.util.*;

public class palin {

    public static void main(String[] args) {

        Node head = new Node(1);
        addNode(head, 2);
        addNode(head, 3);
        addNode(head, 3);
        addNode(head, 5);
        addNode(head, 6);


        Node list = newList(head.next.next.next); //Sending the middle node of 1-2-3-3-4-5-6
        
        while (head != null){
            System.out.print(head.data);
            head = head.next;
        }


    }

    //Answer

    public static Node newList(Node curr){
        Node temp = curr;
        temp.data = temp.next.data; //
        temp.next = temp.next.next;

        return curr;
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

