
import java.util.*;

public class palin {

    public static void main(String[] args) {
//
//        Node head = new Node(1);
//        addNode(head, 2);
//        addNode(head, 3);
//        addNode(head, 3);
//        addNode(head, 5);
//        addNode(head, 6);
//


//        {1, 7, 5, 50 ,40 ,10} post
//
//        int[] array = {1, 7, 5, 50, 40, 10};
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

//        Node head = new Node(2);
//        Node one = new Node(1);
//        Node two = new Node(2);
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

        String longest = "XXVI";
        HashMap<Character, Integer> map = new HashMap<>();

        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);

        int temp = roman(longest, map);

        System.out.println(temp);



    }


    //Answer  O(n)

    public static int roman(String str, HashMap<Character, Integer> map){

        int num = 0;

        num = odd(str, map);

        return num;

    }


    public static int odd(String str, HashMap<Character, Integer> map){

        char[] array = str.toCharArray();
        int sum = 0;

        for(int i = array.length - 1; i >= 0; i--){

            if(i != 0) {
                if (map.get(array[i]) > map.get(array[i - 1])) {
                    sum += map.get(array[i] - map.get(array[i - 1]));
                } else {
                    sum += map.get(array[i]) + map.get(array[i - 1]);
                }
            }

            else{
                sum += map.get(array[i]);
            }

            --i;
        }

        return sum;
    }


    }






    





//    public static Node insert(Node head, Node node) {
//        if (head == null) {
//            return node;
//        }
//
//        if (node.data <= head.data) {
//            head.left = insert(head.left, node);
//            head.left.parent = head;
//
//        } else {
//            head.right = insert(head.right, node);
//            head.right.parent = head;
//        }
//
//        return head;
//    }

//
//
//
//    public static ArrayList<Integer> inOrder(Node head, ArrayList<Integer> list){
//        if(head == null){
//            return list;
//        }
//
//        inOrder(head.left, list);
//        list.add(head.data);
//        inOrder(head.right, list);
//
//
//        return list;
//    }





//    public static void printL(Node head){
//        Node temp = head;
//
//        while(temp != null){
//            System.out.println(temp.data);
//            temp = temp.next;
//        }
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
//
//
//    public static void addNode(Node head, int data){
//        Node temp = head;
//        while(temp.next != null){
//            temp = temp.next;
//        }
//
//        temp.next = new Node(data);
//    }










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












