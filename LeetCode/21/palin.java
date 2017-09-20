
import java.util.*;

public class palin {

    public static void main(String[] args) {
//
//        Node head = new Node(1);
//        addNode(head, 2);
//        addNode(head, 3);
//        addNode(head, 3);
//        addNode(head, 5);
//        addNode(head, 6);
//


//        {1, 7, 5, 50 ,40 ,10} post
//
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

//        Node head = new Node(2);
//        Node one = new Node(1);
//        Node two = new Node(2);
//        Node three = new Node(3);
//        Node four = new Node(4);
//        Node five = new Node(5);
//        Node six = new Node(6);
//
//        insert(head, one);
//        insert(head, two);
//        insert(head, three);
//        insert(head, four);
//        insert(head, five);
//        insert(head, six);
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

        Node head = new Node(1);

        addNode(head, 2);
        addNode(head, 3);
        addNode(head,6);
        addNode(head,7);

        Node head2 = new Node(4);
        addNode(head2, 5);
        addNode(head2,8);
        addNode(head2, 9);

        head = validPar(head, head2);

       printL(head);


    }


    //Answer  O(n^2) time 0(1) space

    public static Node validPar(Node head1, Node head2) {

        Node curr1 = head1;
        Node curr2 = head2;
        boolean check = false;

        while(curr1 != null && curr2 != null){

            if(curr1.data > curr2.data){

                Node temp = curr2.next;
                Node prev = curr2;

                while(temp != null && temp.data < curr1.data){
                    prev = temp;
                    temp = temp.next;
                }

                if(!check){
                    head1 = curr2;
                    check = true;
                }

                prev.next = curr1;
                curr2 = temp;

            }

            else{
                Node temp1 = curr1.next;
                Node prev1 = curr1;
                
                while(temp1 != null && temp1.data < curr2.data){
                    prev1 = temp1;
                    temp1 = temp1.next;
                }

                if(!check){
                    head1 = curr1;
                    check = true;
                }

                prev1.next = curr2;
                curr1 = temp1;
            }


        }

        return head1;
    }


//    public static Node insert(Node head, Node node) {
//        if (head == null) {
//            return node;
//        }
//
//        if (node.data <= head.data) {
//            head.left = insert(head.left, node);
//            head.left.parent = head;
//
//        } else {
//            head.right = insert(head.right, node);
//            head.right.parent = head;
//        }
//
//        return head;
//    }

//
//
//
//    public static ArrayList<Integer> inOrder(Node head, ArrayList<Integer> list){
//        if(head == null){
//            return list;
//        }
//
//        inOrder(head.left, list);
//        list.add(head.data);
//        inOrder(head.right, list);
//
//
//        return list;
//    }


    public static void printL(Node head) {
        Node temp = head;

        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }


    public static class Node {
        Node next = null;
        int data;

        Node(int data) {
            this.data = data;
            this.next = next;
        }
    }


    public static void addNode(Node head, int data) {
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = new Node(data);
    }


}






//
//class Node{
//    int data;
//    Node left;
//    Node right;
//    Node parent;
//
//    Node(int data){
//        this.data = data;
//        left = right = parent = null;
//    }
//
//
//}












