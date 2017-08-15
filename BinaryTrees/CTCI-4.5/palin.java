
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

//        int[] array = {1, 7, 5, 50, 40, 10};

        Node one = new Node(1);
        Node seven = new Node(7);
        Node five = new Node(5);
        Node fifty = new Node(50);
        Node forty = new Node(40);
        Node ten = new Node(10);

        Node head = insert(null, ten);
        insert(head, forty);
        insert(head, fifty);
        insert(head, five);
        insert(head, one);
        insert(head, seven);


        boolean check = checkBST(head, 0, 0);

        System.out.println(check);






    }






    public static boolean checkBST(Node head, int min, int max){

        if(head == null){
            return true;
        }

        if((min != 0 && head.data < min) ||  (max != 0 && head.data > max)){
            return false;
        }

        if(!checkBST(head.left, min, head.data) || !checkBST(head.right, head.data, max)){
            return false;
        }

        return true;
    }





    public static Node insert(Node head, Node node) {
        if (head == null) {
            return node;
        }

        if (node.data <= head.data) {
            head.left = insert(head.left, node);
            head.left.parent = head;

        } else {
            head.right = insert(head.right, node);
            head.right.parent = head;
        }

        return head;
    }




    public static Node inOrder(Node head){
        if(head == null){
            return head;
        }

        System.out.println(head.data);
        inOrder(head.left);
        inOrder(head.right);


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


//    public static void addNode(Node head, int data){
//        Node temp = head;
//        while(temp.next != null){
//            temp = temp.next;
//        }
//
//        temp.next = new Node(data);
//    }



}







class Node{
    int data;
    Node left;
    Node right;
    Node parent;

    Node(int data){
        this.data = data;
        left = right = parent = null;
    }


}












