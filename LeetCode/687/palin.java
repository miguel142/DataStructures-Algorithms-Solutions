
import java.util.*;

public class palin {

    static int ans;
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
        Node one = new Node(2);
        Node two = new Node(2);
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

        System.out.println(longestPath(head));


    }

    public static int longestPath(Node node){
        ans = 0;
        treePath(node);
        return ans;
    }

    public static int treePath(Node node){

        if(node == null){
            return 0;
        }

        int l = treePath(node.left);
        int r = treePath(node.right);

        int tempL = 0;
        int tempR = 0;

        if(node.left != null && node.left.data == node.data){
            tempL = l + 1;
        }

        if(node.right != null && node.right.data == node.data){
            tempR = r + 1;
        }

        ans = Math.max(ans, tempL + tempR);
        return Math.max(tempL, tempR);

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




    public static ArrayList<Integer> inOrder(Node head, ArrayList<Integer> list) {
        if (head == null) {
            return list;
        }

        inOrder(head.left, list);
        list.add(head.data);
        inOrder(head.right, list);


        return list;
    }
}


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












