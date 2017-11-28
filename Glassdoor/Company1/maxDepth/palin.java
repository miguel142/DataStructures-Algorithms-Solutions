
import java.util.*;

public class palin {

    public static void main(String[] args) {



        Node one = new Node(1);
        Node seven = new Node(7);
        Node five = new Node(5);
        Node fifty = new Node(50);
        Node forty = new Node(40);
        Node ten = new Node(10);

        Node head = insert(null, ten);
        insert(head, forty);
        insert(head, fifty);
        insert(head, five);
        insert(head, one);
        insert(head, seven);

        inOrder(head);

        System.out.println(maxDepth(head));


    }

    public static int maxDepth(Node node){

        if(node == null){
            return 0;
        }
        else {

            int left = maxDepth(node.left);
            int right = maxDepth(node.right);

            // return Math.max(left, right) + 1;

            if (left > right)
                return (left + 1);
            else
                return (right + 1);
        }
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

    Node(int data){
        this.data = data;
        left = right = null;
    }


}














