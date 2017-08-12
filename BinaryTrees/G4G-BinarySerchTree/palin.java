
import java.util.*;

public class palin {

    public static void main(String[] args) {

//        Node head = new Node(1);
//        addNode(head, 2);
//        addNode(head, 3);
//        addNode(head, 3);
//        addNode(head, 5);
//        addNode(head, 6);



        //{1, 7, 5, 50 ,40 ,10} post
        int[] array = {1, 7, 5, 50, 40, 10};

        Node newNode = postOrderTree(array);

        inOrder(newNode);



    }

    //Answer

    public static Node postOrderTree(int[] digits){
        int temp = digits[digits.length-1];
        Node first = new Node(temp);
        Node head = insert(null, first);

        for(int i = digits.length - 2; i >= 0; i--){
            Node node = new Node(digits[i]);
            insert(head, node);
        }

        return head;
    }




    public static Node inOrder(Node head){
        if(head == null){
            return head;
        }

        inOrder(head.getLeftChild());
        System.out.println(head.data);
        inOrder(head.getRightChild());



        return head;
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
        } else {
            head.setRightChild(insert(head.getRightChild(), node));
        }

        return head;
    }

//    public static void addNode(Node head, int data){
//        Node temp = head;
//        while(temp.next != null){
//            temp = temp.next;
//        }
//
//        temp.next = new Node(data);
//    }






//    public static class Node{
//        Node next = null;
//        int data;
//
//        Node(int data){
//            this.data = data;
//            this.next = next;
//        }
//    }



}













class Node{
    int data;
    Node leftChild;
    Node rightChild;

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
}











