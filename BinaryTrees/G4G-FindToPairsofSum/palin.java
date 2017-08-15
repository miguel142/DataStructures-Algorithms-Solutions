
import java.util.*;

public class palin {

    public static void main(String[] args) {

//        Node head = new Node(1);
//        addNode(head, 2);
//        addNode(head, 3);
//        addNode(head, 3);
//        addNode(head, 5);
//        addNode(head, 6);



        //{1, 7, 5, 50 ,40 ,10} post

//        int[] array = {1, 7, 5, 50, 40, 10};

        Node one = new Node(1);
        Node seven = new Node(7);
        Node five = new Node(5);
        Node fifty = new Node(50);
        Node forty = new Node(40);
        Node ten = new Node(10);

        Node head = insert(null, ten);
        insert(head, forty);
        insert(head, fifty);
        insert(head, five);
        insert(head, one);
        insert(head, seven);

        ArrayList<Integer> list = new ArrayList<Integer>();

        list = inOrder(head, list);

        list = getPair(list, 23);

        System.out.print(list);


    }


    public static ArrayList<Integer> getPair(ArrayList<Integer> list, int sum){

        int low = 0;
        int high = list.size() - 1;


        while(low < high){

            if(list.get(low) + list.get(high) == sum){
                ArrayList<Integer> tempList = new ArrayList<Integer>();
                tempList.add(list.get(low));
                tempList.add(list.get(high));
                return tempList;
            }

            else if(list.get(low) + list.get(high) > sum){
                --high;
            }
            else{
                ++low;
            }
        }

        System.out.print("No pair is found");

        return list;

    }







    public static Node insert(Node head, Node node) {
        if (head == null) {
            return node;
        }

        if (node.data <= head.data) {
            head.left = insert(head.left, node);
            head.left.parent = head;

        } else {
            head.right = insert(head.right, node);
            head.right.parent = head;
        }

        return head;
    }




    public static ArrayList<Integer> inOrder(Node head, ArrayList<Integer> list){
        if(head == null){
            return list;
        }

        inOrder(head.left, list);
        list.add(head.data);
        inOrder(head.right, list);


        return list;
    }




//    public static void addNode(Node head, int data){
//        Node temp = head;
//        while(temp.next != null){
//            temp = temp.next;
//        }
//
//        temp.next = new Node(data);
//    }






//    public static class Node{
//        Node next = null;
//        int data;
//
//        Node(int data){
//            this.data = data;
//            this.next = next;
//        }
//    }


//    public static void addNode(Node head, int data){
//        Node temp = head;
//        while(temp.next != null){
//            temp = temp.next;
//        }
//
//        temp.next = new Node(data);
//    }



}







class Node{
    int data;
    Node left;
    Node right;
    Node parent;

    Node(int data){
        this.data = data;
        left = right = parent = null;
    }


}












