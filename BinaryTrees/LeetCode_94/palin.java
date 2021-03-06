
import java.util.*;

public class palin {

    public static void main(String[] args) {

//        Node head = new Node(9);
//        addNode(head, 8);
//        addNode(head, 7);
//        addNode(head, 6);
//        addNode(head, 5);
//        addNode(head, 4);
//        addNode(head, 3);
//        addNode(head, 2);
//        addNode(head, 1);
//
//        Node newList = lastNode(head, 3);
//
//        System.out.println(newList.data);

//        while(newList != null){
//            System.out.println(newList.data);
//            newList = newList.next;
//        }
        Node one = new Node(1);
        Node two = new Node(2);
        Node three = new Node(3);
        Node five = new Node(5);

        Node head = insert(null, five);

        insert(head, one);
        insert(head, two);
        insert(head, three);

        ArrayList list = arrayList(head);

        System.out.println(list);

    }

    //Answer

    public static void binaryTree(Node head, ArrayList list) {

        if(head == null){
            return;
        }

        binaryTree(head.getLeftChild(), list);
        list.add(head.getData());
        binaryTree(head.getRightChild(), list);
    }

    public static ArrayList arrayList(Node head){
        ArrayList list = new ArrayList();

        binaryTree(head, list);

        return list;

    }

    //Answer





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



























//    public static char[] swap(char[] word, int front, int back){
//
//    }



        //Answer

        //Answer

//
//    public static void addNode(Node head, int data){
//        Node temp = head;
//        while(temp.next != null){
//            temp = temp.next;
//        }
//
//        temp.next = new Node(data);
//    }




//class Node{
//    Node next = null;
//    int data;
//
//    Node(int data){
//        this.data = data;
//        this.next = next;
//    }
//}

