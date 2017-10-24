
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

//
//        Node head = new Node(2);
//        Node one = new Node(3);
//        Node two = new Node(4);
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
//        Node one1 = new Node(3);
//        Node two1 = new Node(4);
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
//        inOrder(head);


        Node head1 = new Node(20);
        Node one1 = new Node(8);
        Node two1 = new Node(4);
        Node three1 = new Node(12);
        Node four1 = new Node(10);
        Node five1 = new Node(14);
        Node six1 = new Node(22);

        insert(head1, one1);
        insert(head1, two1);
        insert(head1, three1);
        insert(head1, four1);
        insert(head1, five1);
        insert(head1, six1);


        System.out.println(height(head1));



        System.out.println(findDepth(head1));



    }


    public static ArrayList<LinkedList<Integer>> findDepth(Node node){

        int h = height(node);
        ArrayList<LinkedList<Integer>> list = new ArrayList<>();

        for(int i = 0; i < h; i++){
            LinkedList<Integer> link = new LinkedList<>();
            findLevel(node, link, i, 0);
            list.add(link);

        }

        return list;
    }

    public static void findLevel(Node node, LinkedList<Integer> list, int level, int x){

        if(node == null){
            return;
        }
        if(x == level){
            list.add(node.data);
        }

        findLevel(node.left, list, level, x + 1);
        findLevel(node.right, list, level, x + 1);

        return;
    }



    public static int height(Node node){

        if(node == null){
            return 0;
        }

        int leftH = height(node.left);
        int rightH = height(node.right);

        if(leftH > rightH){
            return leftH + 1;
        }
        else{
            return rightH + 1;
        }


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
//
//    public static void inOrder(Node head) {
//        if (head == null) {
//            return;
//        }
//
//
//
//        inOrder(head.left);
//        inOrder(head.right);
//        System.out.println(head.data);
//
//
//        return;
//    }
//
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
//
//
//


}







class Node{
    int data;
    Node left;
    Node right;

    Node(int data){
        this.data = data;
        left = right = null;
    }


}













