import java.util.*;

public class main {

    static HashSet<Integer> set = new HashSet<>();
    static int count = 0;


    public static void main(String args[]){

        Node one = new Node(1);
        Node seven = new Node(7);
        Node five = new Node(10);
        Node fifty = new Node(40);
        Node forty = new Node(40);
        Node ten = new Node(10);


//                   10
//                10      40
//              1    7      40

        Node head = insert(null, ten);
        insert(head, forty);
        insert(head, fifty);
        insert(head, five);
        insert(head, one);
        insert(head, seven);


        traverse(head);

        System.out.println(count);


    }


    public static Node traverse(Node node){

        if(node == null){
            return node;
        }

        if(!set.contains(node.data)){
            set.add(node.data);
            ++count;
        }

        traverse(node.left);
        traverse(node.right);

        return node;
    }

















    public static Node insert(Node head, Node node) {
        if (head == null) {
            return node;
        }

        if (node.data <= head.data) {
            head.left = insert(head.left, node);

        } else {
            head.right = insert(head.right, node);
        }

        return head;
    }

    public static Node inOrder(Node head){

        if(head == null){
            return head;
        }

        System.out.println(head.data);
        inOrder(head.left);
        inOrder(head.right);


        return head;
    }

    public static class Node{

        Node right;
        Node left;
        int data;

        Node(int data){
            this.data = data;
            left = right = null;
        }

    }
}
