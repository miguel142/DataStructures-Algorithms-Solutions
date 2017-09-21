
import java.util.*;

public class palin {

    public static void main(String[] args) {

        Node head = new Node(1);

        addNode(head, 2);
        addNode(head, 3);
        addNode(head,6);
        addNode(head,7);
        addNode(head, 5);
        addNode(head,8);
        addNode(head, 9);
        addNode(head, 9);

       

        //printL(head);

        head = swapPairs(head);

        printL(head);


    }


    //Answer  O(n) time 0(1) space 

    public static Node swapPairs(Node head) {

        if(head == null){
            System.out.println("Empty list");
            return head;
        }



        Node fake = new Node(0);

        fake.next = head;
        Node curr = fake;

        while(curr.next != null && curr.next.next != null){
            Node first = curr.next;
            Node second = curr.next.next;

            first.next = second.next;
            curr.next = second;
            curr.next.next = first;
            curr = curr.next.next;

        }

        return fake.next;

    }


    public static void printL(Node head) {
        Node temp = head;

        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }


    public static class Node {
        Node next = null;
        int data;

        Node(int data) {
            this.data = data;
            this.next = next;
        }
    }


    public static void addNode(Node head, int data) {
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = new Node(data);
    }
}












