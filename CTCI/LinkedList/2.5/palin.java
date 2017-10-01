
import java.util.*;

public class palin {

    public static void main(String[] args) {

        Node head = new Node('a');
        addNode(head, 'a');
        addNode(head, 'b');
        addNode(head, 'c');
        addNode(head, 'd');
        addNode(head, 'c');

        printL(head);

        System.out.println(palindrome(head));



    }


    //Answer  O(n) time 0(1) space

    public static boolean palindrome(Node head) {

        if(head == null){
            System.out.println("Invalid");
            return false;
        }

        int[] table = new int[128];
        Node curr = head;
        int oddCount = 0;

        while(curr != null){

            table[curr.data]++;
            if (table[curr.data] % 2 == 1){
                ++oddCount;
            }
            else{
                --oddCount;
            }
            curr = curr.next;
        }

        if(oddCount > 1){
            return false;
        }

        return true;



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
        char data;

        Node(char data) {
            this.data = data;
            this.next = next;
        }
    }


    public static void addNode(Node head, char data) {
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












