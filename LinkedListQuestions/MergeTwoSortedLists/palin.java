
import java.util.*;

public class palin {

    public static void main(String[] args) {

//        Node head = new Node(1);
//        addNode(head, 2);
//        addNode(head, 3);
//        addNode(head, 3);
//        addNode(head, 5);
//        addNode(head, 6);



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

        LinkedList<Integer> list = new LinkedList<Integer>();
        Stack<Integer> list2 = new Stack<Integer>();
        Stack<Integer> list1 = new Stack<Integer>();

        list2.push(15);
        list2.push(12);
        list2.push(10);
        list2.push(7);
        list2.push(4);

        list1.push(11);
        list1.push(10);
        list1.push(5);
        list1.push(2);



        list = createTree(list1, list2);
        System.out.println(list);



    }



    public static LinkedList<Integer> createTree(Stack<Integer> head1, Stack<Integer> head2){
       LinkedList<Integer> list = new LinkedList<Integer>();

       while(!head1.isEmpty() || !head2.isEmpty()){

           if(!head1.isEmpty() && !head2.isEmpty() && head1.peek() > head2.peek()){
               list.add(head2.pop());

           }
           else if(!head1.isEmpty() && !head2.isEmpty() && head1.peek() < head2.peek()){
               list.add(head1.pop());
           }
           else{
               if(!head1.isEmpty()){
                   list.add(head1.pop());
               }

               if(!head2.isEmpty()){
                   list.add(head2.pop());
               }
           }
       }

       return list;


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







    public static class Node{
        Node next = null;
        int data;

        Node(int data){
            this.data = data;
            this.next = next;
        }
    }


    public static void addNode(Node head, int data){
        Node temp = head;
        while(temp.next != null){
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












