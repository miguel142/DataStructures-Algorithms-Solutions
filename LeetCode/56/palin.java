
import java.util.*;

public class palin {

    public static void main(String[] args) {

//        Node head = new Node('a');
//        addNode(head, 'a');
//        addNode(head, 'b');
//        addNode(head, 'c');
//        addNode(head, 'd');
//        addNode(head, 'c');
//
//


//        {1, 7, 5, 50 ,40 ,10} post
//
//        int[] array = {1, 7, 5, 50, 40, 10};

//
//        Node head1 = new Node(2);
//        Node one1 = new Node(1);
//        Node two1 = new Node(2);
//        Node three1 = new Node(3);
//        Node four1 = new Node(4);
//        Node five1 = new Node(5);
//        Node six1 = new Node(6);
//
//        insert(head1, one1);
//        insert(head1, two1);
//        insert(head1, three1);
//        insert(head1, four1);
//        insert(head1, five1);
//        insert(head1, six1);
//

//        Node head = new Node(1);
//        Node head2 = new Node(2);
//
//        addNode(head, 2);
//        addNode(head, 3);
//        addNode(head,6);
//        addNode(head,7);
//        addNode(head,8);
//        addNode(head, 9);
//        addNode(head, 9);
//
//        addNode(head2,6);
//        addNode(head2,7);
//        addNode(head2,8);
        //     j

//
//        Node head = new Node(2);
//        Node one = new Node(3);
//        Node two = new Node(4);
//        Node three = new Node(3);
//        Node four = new Node(4);
//        Node five = new Node(5);
//        Node six = new Node(6);
//
//        insert(head, one);
//        insert(head, two);
//        insert(head, three);
//        insert(head, four);
//        insert(head, five);
//        insert(head, six);
//
//        Node head1 = new Node(2);
//        Node one1 = new Node(3);
//        Node two1 = new Node(4);
//        Node three1 = new Node(3);
//        Node four1 = new Node(4);
//        Node five1 = new Node(5);
//        Node six1 = new Node(6);
//
//        insert(head1, one1);
//        insert(head1, two1);
//        insert(head1, three1);
//        insert(head1, four1);
//        insert(head1, five1);
//        insert(head1, six1);

//
//        Node one = new Node(1);
//        Node seven = new Node(7);
//        Node five = new Node(5);
//        Node fifty = new Node(50);
//        Node forty = new Node(40);
//        Node ten = new Node(10);
//
//        Node head = insert(null, ten);
//        insert(head, forty);
//        insert(head, fifty);
//        insert(head, five);
//        insert(head, one);
//        insert(head, seven);
//
//        inOrder(head);

        ArrayList<Node> inter = new ArrayList<>();
        Node one = new Node(1,3);
        Node two = new Node(2,6);
        Node three = new Node(8,10);
        Node four = new Node(15,18);

        inter.add(one);
        inter.add(two);
        inter.add(three);
        inter.add(four);

        inter = merge(inter);

        for(int i = 0; i < inter.size(); i++){
            System.out.println(inter.get(i).start+ " "+ inter.get(i).end);
        }

    }


    public static ArrayList<Node> merge(ArrayList<Node> intervals) {

        intervals.sort((i1, i2) -> Integer.compare(i1.start, i2.start));
        ArrayList<Node> list = new ArrayList<>();

        for(int i = 0; i < intervals.size(); i++){

            int end = intervals.get(i).end;
            Node inter = new Node(intervals.get(i).start, intervals.get(i).end);

            for(int j = i + 1; j < intervals.size(); j++ ){

                if(end > intervals.get(j).start){

                    inter = new Node(intervals.get(i).start, intervals.get(j).end);
                    i = j;
                }
            }

            list.add(inter);
        }



        return list;

    }


//
//    public static Node insert(Node head, Node node) {
//
//        if (head == null) {
//            return node;
//        }
//
//        if (node.data <= head.data) {
//            head.left = insert(head.left, node);
//            //head.left.parent = head;
//
//        } else {
//            head.right = insert(head.right, node);
//            //head.right.parent = head;
//        }
//
//        return head;
//    }
//
//    public static void inOrder(Node head) {
//        if (head == null) {
//            return;
//        }
//
//
//        System.out.println(head.data);
//        inOrder(head.left);
//        inOrder(head.right);
//
//
//        return;
//    }
//
//
//    public static void printL(Node head) {
//        Node temp = head;
//
//        while (temp != null) {
//            System.out.println(temp.data);
//            temp = temp.next;
//        }
//    }
//
//
//    public static class Node {
//        Node next = null;
//        char data;
//
//        Node(char data) {
//            this.data = data;
//            this.next = next;
//        }
//    }
//
//
//    public static void addNode(Node head, char data) {
//        Node temp = head;
//        while (temp.next != null) {
//            temp = temp.next;
//        }
//
//        temp.next = new Node(data);
//    }
//
//
//}
//
//
//


}



class Node{
    int start = 0;
    int end = 0;


    Node(int start, int end){
       this.start = start;
       this.end = end;
    }


}




//class Node{
//    int data;
//    Node left;
//    Node right;
//
//    Node(int data){
//        this.data = data;
//        left = right = null;
//    }
//
//
//}












