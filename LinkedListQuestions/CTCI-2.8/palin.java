
import java.util.*;

public class palin {

    public static void main(String[] args) {

        Node first = new Node(2);

        first.next = new Node(5);
        first.next.next = new Node(6);
        first.next.next.next = new Node(7);
        first.next.next.next.next = first;

        Node inter = intersect(first);

        System.out.println(inter.data);

    }

    //Answer
    public static Node intersect(Node head){
        Node temp = head;
        HashSet<Node> set = new HashSet<Node>();

        while(temp != null){
            if(set.contains(temp)){
                return temp;
            }
            else{
                set.add(temp);
            }
            temp = temp.next;
        }

        System.out.println("No loop");
        return head;
    }

    //Answer

    public static class Node{
        Node next = null;
        int data;

        Node(int data){
            this.data = data;
            this.next = next;
        }
    }



}






