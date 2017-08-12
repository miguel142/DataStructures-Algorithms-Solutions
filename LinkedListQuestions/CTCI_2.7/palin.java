
import java.util.*;

public class palin {

    public static void main(String[] args) {

        Node first = new Node(2);
        Node second = new Node(3);

        first.next = new Node(5);
        first.next.next = new Node(6);
        first.next.next.next = second.next = new Node(7);

        Node inter = intersect(first, second);

        System.out.println(inter.data);



       

    }

    //Answer
    public static Node intersect(Node first, Node second){
        Node firstTemp = first;
        Node secondTemp = second;
        HashSet<Node> set = new HashSet<Node>();

        while(firstTemp != null){
            set.add(firstTemp);
            firstTemp = firstTemp.next;
        }

        while(secondTemp != null){
            if(set.contains(secondTemp)){
                return secondTemp;
            }

            secondTemp = secondTemp.next;
        }

        return first;
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











