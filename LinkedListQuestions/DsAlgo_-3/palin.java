
import java.util.*;

public class palin {
    public static void main(String[] args) {

        Node head = new Node(9);
        addNode(head, 8);
        addNode(head, 7);
        addNode(head, 6);
        addNode(head, 5);
        addNode(head, 4);
        addNode(head, 3);
        addNode(head, 2);
        addNode(head, 1);

        Node newList = breakList(head);

        while(newList != null){
            System.out.println(newList.data);
            newList = newList.next;
        }



    }
    
    //Answer

    public static Node breakList(Node head){

        Node fastPointer = head;
        Node slowPointer = head;

        while(fastPointer != null){
           slowPointer = slowPointer.next;
           fastPointer = fastPointer.next;

           if(fastPointer != null){
               fastPointer = fastPointer.next;
           }
        }

        Node middlePointer = slowPointer;
        Node tempMiddlePointer = middlePointer;
        Node secondHead = null;

        while(middlePointer != null){
            Node n = new Node(middlePointer.data);

            n.next = secondHead;
            secondHead = n;

            middlePointer = middlePointer.next;
        }

        Node originalNode = head;

        while(secondHead != null){

            Node newNode = new Node (secondHead.data);
            Node temp = originalNode.next;

            originalNode.next = newNode;
            newNode.next = temp;

            originalNode = originalNode.next.next;
            secondHead = secondHead.next;



        }



        originalNode.next = null;

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

