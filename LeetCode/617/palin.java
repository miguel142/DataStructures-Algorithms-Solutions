
import java.util.*;

public class palin {

    public static void main(String[] args) {

//        Node head = new Node('a');
//        addNode(head, 'a');
//        addNode(head, 'b');
//        addNode(head, 'c');
//        addNode(head, 'd');
//        addNode(head, 'c');
//
//


//        {1, 7, 5, 50 ,40 ,10} post
//
//        int[] array = {1, 7, 5, 50, 40, 10};

//
//        Node head1 = new Node(2);
//        Node one1 = new Node(1);
//        Node two1 = new Node(2);
//        Node three1 = new Node(3);
//        Node four1 = new Node(4);
//        Node five1 = new Node(5);
//        Node six1 = new Node(6);
//
//        insert(head1, one1);
//        insert(head1, two1);
//        insert(head1, three1);
//        insert(head1, four1);
//        insert(head1, five1);
//        insert(head1, six1);
//

//        Node head = new Node(1);
//        Node head2 = new Node(2);
//
//        addNode(head, 2);
//        addNode(head, 3);
//        addNode(head,6);
//        addNode(head,7);
//        addNode(head,8);
//        addNode(head, 9);
//        addNode(head, 9);
//
//        addNode(head2,6);
//        addNode(head2,7);
//        addNode(head2,8);
        //     j

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


        Node head = new Node(2);
        Node one = new Node(3);
        Node two = new Node(4);
        Node three = new Node(3);
        Node four = new Node(4);
        Node five = new Node(5);
        Node six = new Node(6);

        insert(head, one);
        insert(head, two);
        insert(head, three);
        insert(head, four);
        insert(head, five);
        insert(head, six);

        Node head1 = new Node(2);
        Node one1 = new Node(3);
        Node two1 = new Node(4);
        Node three1 = new Node(3);
        Node four1 = new Node(4);
        Node five1 = new Node(5);
        Node six1 = new Node(6);

        insert(head1, one1);
        insert(head1, two1);
        insert(head1, three1);
        insert(head1, four1);
        insert(head1, five1);
        insert(head1, six1);




        head =check(head, head1);

        inOrder(head);


    }

    public static Node check(Node node1, Node node2){
        if(node1 == null || node2 == null){
            System.out.println("Invalid");
            return node1;
        }

        Node newHead = null;

        newHead =merge(node1, node2, newHead);

        return newHead;
    }

    public static Node merge(Node node1, Node node2, Node newHead){

        if(node1 == null || node2 == null){
            return newHead;
        }

        Node temp = new Node(node1.data + node2.data);

        if(newHead == null){
            newHead = insert(null, temp);
        }

        else{
            newHead = insert(newHead, temp);
        }

        merge(node1.left, node2.left, newHead);
        merge(node1.right, node2.right, newHead);

        return newHead;

    }



    public static Node insert(Node head, Node node) {

        if (head == null) {
            return node;
        }

        if (node.data <= head.data) {
            head.left = insert(head.left, node);
            //head.left.parent = head;

        } else {
            head.right = insert(head.right, node);
            //head.right.parent = head;
        }

        return head;
    }

    public static void inOrder(Node head) {
        if (head == null) {
            return;
        }


        inOrder(head.left);
        System.out.println(head.data);
        inOrder(head.right);


        return;
    }
}

//
//    public static void printL(Node head) {
//        Node temp = head;
//
//        while (temp != null) {
//            System.out.println(temp.data);
//            temp = temp.next;
//        }
//    }
//
//
//    public static class Node {
//        Node next = null;
//        char data;
//
//        Node(char data) {
//            this.data = data;
//            this.next = next;
//        }
//    }
//
//
//    public static void addNode(Node head, char data) {
//        Node temp = head;
//        while (temp.next != null) {
//            temp = temp.next;
//        }
//
//        temp.next = new Node(data);
//    }
//
//
//}







class Node{
    int data;
    Node left;
    Node right;
   // Node parent;

    Node(int data){
        this.data = data;
        left = right = null;
    }


}












