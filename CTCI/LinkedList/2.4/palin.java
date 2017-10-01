
import java.util.*;

public class palin {

    public static void main(String[] args) {

        Node head = new Node(1);
        addNode(head, 2);
        addNode(head, 3);
        addNode(head, 4);
        addNode(head, 5);
        addNode(head, 6);
        addNode(head, 2);
        addNode(head, 10);


       head = partition(head, 4);
        printL(head);


    }


    //Answer  O(n) time 0(n) space

    public static Node partition(Node head, int x) {

        if(head == null){
            System.out.println("Invalid");
            return head;
        }

        Node newHead =  new Node(head.data);
        Node tail = newHead;
        Node curr = head.next;

        while(curr != null){
            if(curr.data < x){
                Node temp = new Node(curr.data);
                temp.next = newHead;
                newHead = temp;
            }
            else{
                Node temp = new Node(curr.data);
                tail.next = temp;
                tail = temp;
            }

            curr = curr.next;
        }

        head = null;

        return newHead;



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















