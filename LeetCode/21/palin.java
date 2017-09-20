
import java.util.*;

public class palin {

    public static void main(String[] args) {

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













