
import java.util.*;

public class palin {

    public static void main(String[] args) {

        Node head = new Node(1);
        addNode(head, 2);
        addNode(head, 3);
        addNode(head, 3);
        addNode(head, 5);
        addNode(head, 6);

        int count = kNode(head, 4);

        System.out.print(count);



    }

    //Answer

    public static int kNode(Node head, int k){

        Node slowP = head;
        Node fastP = head;
        int counter = 0;

        while(fastP != null){
            if(counter < k){
                fastP = fastP.next;
                ++counter;
            }
            else{
                fastP =fastP.next;
                slowP = slowP.next;
            }
        }

        return slowP.data;


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

