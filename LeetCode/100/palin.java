
import java.util.*;

public class palin {

    public static void main(String[] args) {


        Node head = new Node(2);
        Node one = new Node(3);
        Node two = new Node(4);
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

        Node head1 = new Node(2);
        Node one1 = new Node(3);
        Node two1 = new Node(4);
        Node three1 = new Node(3);
        Node four1 = new Node(4);
        Node five1 = new Node(5);
        Node six1 = new Node(6);

        insert(head1, one1);
        insert(head1, two1);
        insert(head1, three1);
        insert(head1, four1);
        insert(head1, five1);
        insert(head1, six1);

        System.out.println(check(head, head1));


    }

    public static boolean check(Node node1, Node node2){
        if(node1 == null || node2 == null){
            System.out.println("Invalid");
            return false;
        }

        return sameTree(node1, node2);
    }

    public static boolean sameTree(Node node1, Node node2){
        if(node1 == null && node2 == null){
            return true;
        }

        if(node1 == null && node2 != null || node1 != null && node2 == null){
            return false;
        }

        if(node1.data != node2.data){
            return false;
        }

        if(!sameTree(node1.left, node2.left) || !sameTree(node1.right, node1.right)){
            return false;
        }

        return true;
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

    public static void inOrder(Node head) {
        if (head == null) {
            return;
        }


        inOrder(head.left);
        System.out.println(head.data);
        inOrder(head.right);


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












