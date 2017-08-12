
import java.util.*;

public class palin {

    public static void main(String[] args) {

//        Node head = new Node(1);
//        addNode(head, 2);
//        addNode(head, 3);
//        addNode(head, 3);
//        addNode(head, 5);
//        addNode(head, 6);


//
//
//
//       Node head = insert(null, two);
//       insert(head, three);
//       insert(head, four);
//        insert(head, eight);
//        insert(head, five);


//        Node one = new Node(1);
//        Node two = new Node(2);
//        Node three = new Node(3);
//        Node five = new Node(5);
//
//        Node head = insert(null, five);
//
//        insert(head, one);
//        insert(head, two);
//        insert(head, three);\
        Node first = new Node(2);

        first.next = new Node(5);
        first.next.next = new Node(6);
        first.next.next.next = new Node(7);
        first.next.next.next.next = first;

        Node inter = intersect(first);

        System.out.println(inter.data);

    }

    //Answer
    public static Node intersect(Node head){
        Node temp = head;
        HashSet<Node> set = new HashSet<Node>();

        while(temp != null){
            if(set.contains(temp)){
                return temp;
            }
            else{
                set.add(temp);
            }
            temp = temp.next;
        }

        System.out.println("No loop");
        return head;
    }

    //Answer


//    public static void addNode(Node head, int data){
//        Node temp = head;
//        while(temp.next != null){
//            temp = temp.next;
//        }
//
//        temp.next = new Node(data);
//    }


//    public static Node insert(Node head, Node node) {
//        if (head == null) {
//            return node;
//        }
//
//        if (node.getData() <= head.getData()) {
//            head.setLeftChild(insert(head.getLeftChild(), node));
//        } else {
//            head.setRightChild(insert(head.getRightChild(), node));
//        }
//
//        return head;
//    }



    public static class Node{
        Node next = null;
        int data;

        Node(int data){
            this.data = data;
            this.next = next;
        }
    }



}












//
//class Node{
//    int data;
//    Node leftChild;
//    Node rightChild;
//
//    Node(int data){
//        this.data = data;
//    }
//
//    public int getData() {
//        return data;
//    }
//
//    public Node getLeftChild() {
//        return leftChild;
//    }
//
//    public void setLeftChild(Node leftChild) {
//        this.leftChild = leftChild;
//    }
//
//    public Node getRightChild() {
//        return rightChild;
//    }
//
//    public void setRightChild(Node rightChild) {
//        this.rightChild = rightChild;
//    }
//}











