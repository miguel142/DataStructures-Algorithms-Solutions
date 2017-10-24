
import java.util.*;

public class palin {

    public static void main(String[] args) {


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













