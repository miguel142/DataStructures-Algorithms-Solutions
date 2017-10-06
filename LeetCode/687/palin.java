
import java.util.*;

public class palin {

    static int ans;
    public static void main(String[] args) {

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












