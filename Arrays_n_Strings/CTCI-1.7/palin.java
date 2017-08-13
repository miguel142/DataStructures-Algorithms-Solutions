
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

//        int[] array = {1, 7, 5, 50, 40, 10};
//
//        Node one = new Node(1);
//        Node seven = new Node(7);
//        Node five = new Node(5);
//        Node fifty = new Node(50);
//        Node forty = new Node(40);
//        Node ten = new Node(10);
//
//        Node head = insert(null, ten);
//        insert(head, forty);
//        insert(head, fifty);
//        insert(head, five);
//        insert(head, one);
//        insert(head, seven);


//
//        Node head = new Node(7);
//        Node head2 = new Node(5);
//
//        addNode(head, 1);
//        addNode(head, 6);
//
//        addNode(head2, 9);
//        addNode(head2, 2);


        int[][] matrix = {{1,2,3}, {3,4,5}, {6,7,8}};

        int[][] temp = rotate(matrix);

        for(int i = 0; i < matrix.length; i++){

            System.out.println();

            for(int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j]);
            }
        }

        System.out.println();

        for(int i = 0; i < temp.length; i++){

            System.out.println();

            for(int j = 0; j < temp.length; j++) {
                System.out.print(temp[i][j]);
            }
        }


    }

    //Answer







//
//    public static Stack<Node> inOrder(Node head, Stack<Node> st){
//        if(head == null){
//            return st;
//        }
//
//        inOrder(head.getRightChild(), st);
//        st.add(head);
//        inOrder(head.getLeftChild(), st);
//
//
//        return st;
//    }
//
//
//    public static Node insert(Node head, Node node) {
//        if (head == null) {
//            return node;
//        }
//
//        if (node.getData() <= head.getData()) {
//            head.setLeftChild(insert(head.getLeftChild(), node));
//            head.getLeftChild().setParent(head);
//
//        } else {
//            head.setRightChild(insert(head.getRightChild(), node));
//            head.getRightChild().setParent(head);
//        }
//
//
//        return head;
//    }

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


//    public static void addNode(Node head, int data){
//        Node temp = head;
//        while(temp.next != null){
//            temp = temp.next;
//        }
//
//        temp.next = new Node(data);
//    }

    public static int[][] rotate(int[][] matrix){

        int[][] newArray = new int[matrix.length][matrix[0].length];

        for(int i = 0; i < matrix.length; i++){

            int[] temp = matrix[i];

            for(int j = matrix.length -1 ; j > -1; j--){

                int counter = matrix.length - 1 - j;

                 newArray[j][i] = temp[counter];
            }

        }

        return newArray;
    }





}












/*
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


} */


//class Node{
//    Node next = null;
//    int data;
//
//
//
//    Node(int data){
//        this.data = data;
//        this.next = next;
//    }
//}











