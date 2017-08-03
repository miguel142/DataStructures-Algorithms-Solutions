
import java.util.*;

public class palin {
    public static void main(String[] args) {

        Node head = new Node(5);
        addNode(head, 4);
        addNode(head, 3);
        addNode(head, 2);
        addNode(head, 1);

        converter(head, 3);



    }
    
    //Answer

    public static void converter(Node head, int x){

       Node temp = head;
       Node front = null;
       Node back = null;
        while(temp != null){

            Node current = new Node(temp.data);
            if(front == null){
                front = current;
                back = front;
            }

            else if(temp.data < x){

                current.next = front;
                front = current;
            }

            else{
                back.next = current;
                back = current;
            }

            temp = temp.next;
        }

        Node newCurrent = front;

        while(newCurrent != null){
            System.out.println(newCurrent.data);
            newCurrent = newCurrent.next;
        }
        
        //Answer


    }



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

