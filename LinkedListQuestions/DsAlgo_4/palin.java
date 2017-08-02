
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

        Node newList = reverseList(head, 2);

        while(newList != null){
            System.out.println(newList.data);
            newList = newList.next;
        }



    }

    //Answer

    public static Node reverseList(Node head, int k){

        if(head == null){
            System.out.println("out of bounds");
            return head;
        }

        Node current = head;
        Node newList = null;
        int count = 0;

        while(current != null || count < k ){
            Node n = new Node(current.data);

            n.next = newList;
            newList = n;

            current = current.next;
            ++count;

        }

        if(current != null){
            newList = reverseList(current, k);
        }

        return newList;


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

