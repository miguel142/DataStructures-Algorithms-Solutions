
import java.util.*;

public class palin {

    public static void main(String[] args) {

        Node head = new Node(1);
        addNode(head, 2);
        addNode(head, 3);
        addNode(head, 3);
        addNode(head, 5);
        addNode(head, 6);

        
        head = remove(head);
        printL(head);



    }


    //Answer  O(n) time 0(n) space

    public static Node remove(Node head) {
        Node dummy = new Node(0);
        dummy.next = head;

        Node curr = dummy;
        HashSet<Integer> set = new HashSet<>();

        while(curr.next != null){

            if(set.contains(curr.next.data)){
                curr.next = curr.next.next;
            }

            else{
                set.add(curr.next.data);
            }

            curr = curr.next;
        }

        dummy.next = null;

        return head;




    }


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












