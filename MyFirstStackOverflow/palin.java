
import java.util.*;

public class palin {

    static Node newNode = null;

    public static void main(String[] args) {

        Node head = new Node(2);
        Node one = new Node(2);
        Node two = new Node(2);
        Node three = new Node(3);
        Node four = new Node(4);
        Node five = new Node(5);
        Node six = new Node(6);

        insert(head, one);
        insert(head, two);
        insert(head, three);
        insert(head, four);
        insert(head, five);
        insert(head, six);

        invert(head);

        inOrder(newNode);

       


    }


    public static void invert(Node head) {

        if (head == null) {
            return;
        }

        preOrder(head);

    }


    public static Node insertInvert(Node node) {

        if (newNode == null) {
            newNode = node;
            return node;
        }

        if (node.data >= newNode.data) {
            newNode.left = insert(newNode.left, node);
            //head.left.parent = head;

        } else {
            newNode.right = insert(newNode.right, node);
            //head.right.parent = head;
        }

        return newNode;
    }

    public static Node insert(Node head, Node node) {

        if (head == null) {
            return node;
        }

        if (node.data <= head.data) {
            head.left = insert(head.left, node);
            //head.left.parent = head;

        } else {
            head.right = insert(head.right, node);
            //head.right.parent = head;
        }

        return head;
    }


    public static int preOrder(Node head) {
        if (head == null) {
            return 0;
        }


        Node node = new Node(head.data);
        insertInvert(node);
        preOrder(head.left);
        preOrder(head.right);


        return 0;
    }

    public static void inOrder(Node head) {
        if (head == null) {
            return;
        }


        preOrder(head.left);
        System.out.println(head.data);
        preOrder(head.right);


        return;
    }
}


class Node{
    int data;
    Node left;
    Node right;
   // Node parent;

    Node(int data){
        this.data = data;
        left = right = null;
    }


}












