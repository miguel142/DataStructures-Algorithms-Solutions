
import java.util.*;

public class palin {

    public static void main(String[] args) {

        Node head = new Node(1);
        addNode(head, 2);
        addNode(head, 3);
        addNode(head, 3);
        addNode(head, 5);
        addNode(head, 6);


        int temp = remove(head, 2);
        System.out.println(temp);



    }


    //Answer  O(n) time 0(1) space

    public static int remove(Node head, int k) {

        Node fastP = head;
        Node slowP = head;

        int count = 0;

        while(count < k && fastP != null){
            fastP = fastP.next;
            ++count;
        }

        while(fastP != null){
            slowP = slowP.next;
            fastP = fastP.next;
        }

        return slowP.data;

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






//
//class Node{
//    int data;
//    Node left;
//    Node right;
//    Node parent;
//
//    Node(int data){
//        this.data = data;
//        left = right = parent = null;
//    }
//
//
//}












