
import java.util.*;

public class palin {

    public static void main(String[] args) {

        Node head = new Node(1);
        Node head2 = new Node(2);

        addNode(head, 2);
        addNode(head, 3);
        addNode(head,6);
        addNode(head,7);
        addNode(head,8);
        addNode(head, 9);
        addNode(head, 9);

        addNode(head2,6);
        addNode(head2,7);
        addNode(head2,8);

        head = merge(head, head2);

        printL(head);



    }


    //Answer  O(n) time 0(n) space

    public static Node merge(Node head, Node head2) {
        Node curr1 = head;
        Node curr2 = head2;

        if(curr1 == null || curr2 == null){
            System.out.println("Invalid");
            return head;
        }

        Node newHead = new Node(curr2.data);
        if(curr1.data > curr2.data){
            newHead.data = curr2.data;
            curr2 = curr2.next;
        }
        else{
            newHead.data = curr1.data;
            curr1 = curr1.next;
        }

        while(curr1 != null || curr2 != null){

            if(curr1 != null && curr2 != null){

                if(curr1.data > curr2.data){
                    addNode(newHead, curr2.data);
                    curr2 = curr2.next;
                }
                else{
                    addNode(newHead, curr1.data);
                    curr1 = curr1.next;
                }
            }

            else if(curr1 != null){
                addNode(newHead, curr1.data);
                curr1 = curr1.next;
            }

            else{
                addNode(newHead, curr2.data);
                curr2 = curr2.next;
            }
        }

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












