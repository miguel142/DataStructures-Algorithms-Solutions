
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
        /*
        int[] array = {1, 7, 5, 50, 40, 10};

        Node one = new Node(1);
        Node seven = new Node(7);
        Node five = new Node(5);
        Node fifty = new Node(50);
        Node forty = new Node(40);
        Node ten = new Node(10);

        Node one1 = new Node(6);
        Node seven1 = new Node(9);
        Node five1 = new Node(3);
        Node fifty1 = new Node(50);
        Node forty1 = new Node(40);
        Node ten1 = new Node(10);

        Node head = insert(null, ten);
        insert(head, forty);
        insert(head, fifty);
        insert(head, five);
        insert(head, one);
        insert(head, seven);

        Node head2 = insert(null, one1);
        insert(head2, forty1);
        insert(head2, seven1);
        insert(head2, five1);
        insert(head2, ten1);
        insert(head2, fifty1);

         minValue(head, head2);

        */


        Node head = new Node(7);
        Node head2 = new Node(5);

        addNode(head, 1);
        addNode(head, 6);

        addNode(head2, 9);
        addNode(head2, 2);

        double answer = sum(head, head2);
        System.out.print(answer);

    }

    //Answer
    /*
    public static void minValue(Node head, Node head2){

        if(head == null){
            System.out.println("out of bounds");
        }

        Stack<Node> st1 = new Stack<Node>();
        Stack<Node> st2 = new Stack<Node>();
        st1 = inOrder(head, st1);
        st2 = inOrder(head2, st2);

        while(!st1.isEmpty() || !st2.isEmpty()){
            if(st1.peek().getData() > st2.peek().getData()){
                System.out.println(st2.pop().getData());
            }
            else if(st1.peek().getData() < st2.peek().getData()){
                System.out.println(st1.pop().getData());
            }
            else{
                if(!st1.isEmpty()){
                    System.out.println(st1.pop().getData());
                }
                if(!st2.isEmpty()){
                    System.out.println(st2.pop().getData());
                }
            }
        }



    }



    public static Stack<Node> inOrder(Node head, Stack<Node> st){
        if(head == null){
            return st;
        }

        inOrder(head.getRightChild(), st);
        st.add(head);
        inOrder(head.getLeftChild(), st);


        return st;
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
    } */

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


    public static void addNode(Node head, int data){
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }

        temp.next = new Node(data);
    }



    public static double sum(Node head, Node head2){
        Node temp = head;
        Node temp2 = head2;

        double count = 0;
        double count2 = 0;
        double constant = 10;
        double firstNum = 0;
        double secNum = 0;

        while(temp !=null || temp2 != null){

            if(temp!=null){
                firstNum += temp.data * Math.pow(constant, count);
                count++;
                temp = temp.next;
            }

            if(temp2 != null){
            secNum += temp2.data * Math.pow(constant, count2);
            count2++;
            temp2 = temp2.next;
            }
        }

        return firstNum+secNum;
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


class Node{
    Node next = null;
    int data;



    Node(int data){
        this.data = data;
        this.next = next;
    }
}











