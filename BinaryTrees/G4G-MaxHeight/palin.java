
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
        insert(head, fifty);
        insert(head, forty);
        insert(head, five);
        insert(head, seven);
        insert(head, one);

        int temp = max(head);

        System.out.println(temp);


    }

    //Answer

    public static int max(Node head){
        if(head == null){
            return 0;
        }
        else {

            int maxLeft = max(head.getLeftChild()) + 1;
            int maxRight = max(head.getRightChild()) + 1;

            if (maxLeft > maxRight) {
                return maxLeft;
            } else {
                return maxRight;
            }
        }
    }








    public static Node postOrder(Node head){
        if(head == null){
            return head;
        }


        postOrder(head.getLeftChild());
        postOrder(head.getRightChild());
        System.out.println(head.data);


        return head;
    }


    public static Node insert(Node head, Node node) {
        if (head == null) {
            return node;
        }

        if (node.getData() <= head.getData()) {
            head.setLeftChild(insert(head.getLeftChild(), node));
            head.getLeftChild().setParent(head);

        } else {
            head.setRightChild(insert(head.getRightChild(), node));
            head.getRightChild().setParent(head);
        }

        return head;
    }



}













class Node{
    int data;
    Node leftChild;
    Node rightChild;
    Node parent;

    Node(int data){
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public Node getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(Node leftChild) {
        this.leftChild = leftChild;
    }

    public Node getRightChild() {
        return rightChild;
    }

    public void setRightChild(Node rightChild) {
        this.rightChild = rightChild;
    }

    public Node getParent() {
        return parent;
    }

    public void setParent(Node parent) {
        this.parent = parent;
    }
}











