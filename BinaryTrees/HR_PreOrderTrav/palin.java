
import java.util.*;

public class palin {

    public static void main(String[] args) {

//        Node head = new Node('t');
//        addNode(head, 'h');
//        addNode(head, 's');
//        addNode(head, 'h');
//        addNode(head, 't');
//        addNode(head, 's');
        Node two = new Node(2);
        Node three = new Node(1);
        Node four = new Node(4);
        Node eight = new Node(8);
        Node five = new Node(3);



       Node head = insert(null, two);
       insert(head, three);
       insert(head, four);
        insert(head, eight);
        insert(head, five);

       preOrder(head);


//        Node one = new Node(1);
//        Node two = new Node(2);
//        Node three = new Node(3);
//        Node five = new Node(5);
//
//        Node head = insert(null, five);
//
//        insert(head, one);
//        insert(head, two);
//        insert(head, three);


    }

    //Answer

    public static Node preOrder(Node node){

        if(node == null){
            return node;
        }

        System.out.println(node.data);
        preOrder(node.getLeftChild());
        preOrder(node.getRightChild());

        return node;


    }

//    public static void addNode(Node head, char data){
//        Node temp = head;
//        while(temp.next != null){
//            temp = temp.next;
//        }
//
//        temp.next = new Node(data);
//    }


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









//class Node{
//    Node next = null;
//    char data;
//
//    Node(char data){
//        this.data = data;
//        this.next = next;
//    }
//}

