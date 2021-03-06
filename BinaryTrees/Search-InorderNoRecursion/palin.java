
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

        inOrderWithoutRec(head);

    }

    //Answer

    public static void inOrderWithoutRec(Node head){
        Stack<Node> st = new Stack<Node>();

        Node curr = head;

        while(curr != null){
            st.push(curr);
            curr = curr.getLeftChild();
        }

        while(st.size() > 0){
            curr = st.pop();
            System.out.println(curr.data + " ");

            if(curr.getRightChild() != null){
                curr = curr.getRightChild();

                while(curr != null){
                    st.push(curr);
                    curr = curr.getLeftChild();
                }
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











