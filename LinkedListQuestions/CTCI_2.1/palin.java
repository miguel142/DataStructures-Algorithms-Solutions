
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

        while(head != null){
            System.out.print(head.data);
            head = head.next;
        }



    }

    //Answer

    public static Node remove(Node head){

        HashSet set = new HashSet();
        Node curr = head;

        set.add(curr.data);

        while(curr.next != null){
            if(set.contains(curr.next.data)){
                curr.next = curr.next.next;
            }
            else{
                set.add(curr.next.data);
            }

            curr = curr.next;
        }

        return head;

    }

    //Answer








    public static void addNode(Node head, int data){
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }

        temp.next = new Node(data);
    }

}


class Node{
    Node next = null;
    int data;

    Node(int data){
        this.data = data;
        this.next = next;
    }
}

