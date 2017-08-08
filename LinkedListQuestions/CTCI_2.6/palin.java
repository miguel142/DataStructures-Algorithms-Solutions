
import java.util.*;

public class palin {

    public static void main(String[] args) {

        Node head = new Node('t');
        addNode(head, 'h');
        addNode(head, 's');
        addNode(head, 'h');
        addNode(head, 't');
        addNode(head, 's');

        boolean palin = palindrome(head);

        System.out.print(palin);


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

    public static boolean palindrome(Node head){

        Node curr = head;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();



        while(curr != null){
            if(map.containsKey(curr.data)){
                map.put(curr.data, map.get(curr.data) + 1);
            }
            else{
                map.put(curr.data, 1);
            }

            curr = curr.next;
        }


        curr = head;
        boolean check = true;
        int counter = 0;

        while(curr != null){
            int num = map.get(curr.data);

            if(num%2 != 0){
              counter++;
            }

            curr = curr.next;

        }

        if(counter > 1){
            return false;
        }

        return true;



    }

    public static void addNode(Node head, char data){
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }

        temp.next = new Node(data);
    }

}

//
//
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









class Node{
    Node next = null;
    char data;

    Node(char data){
        this.data = data;
        this.next = next;
    }
}

