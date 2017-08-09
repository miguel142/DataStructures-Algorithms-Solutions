
import java.util.*;

public class palin {

    public static void main(String[] args) {

//        Node head = new Node('t');
//        addNode(head, 'h');
//        addNode(head, 's');
//        addNode(head, 'h');
//        addNode(head, 't');
//        addNode(head, 's');
//        Node two = new Node(2);
//        Node three = new Node(1);
//        Node four = new Node(4);
//        Node eight = new Node(8);
//        Node five = new Node(3);
//
//
//
//       Node head = insert(null, two);
//       insert(head, three);
//       insert(head, four);
//        insert(head, eight);
//        insert(head, five);

        int[] array = {1, 2, 3, 2, 3, 1, 3, 2};

        ArrayList list = threeSum(array, 6);

        System.out.println(list);
//        Node one = new Node(1);
//        Node two = new Node(2);
//        Node three = new Node(3);
//        Node five = new Node(5);
//
//        Node head = insert(null, five);
//
//        insert(head, one);
//        insert(head, two);
//        insert(head, three);


    }

    //Answer

    public static ArrayList threeSum(int[] array, int sum){

        Arrays.sort(array);
        ArrayList<ArrayList> bigList = new ArrayList<ArrayList>();

        HashSet set = new HashSet();

        for(int i = 0; i < array.length; i++){

            int counter = sum - array[i];
            int low = i + 1;
            int high = array.length - 1;

            while(low < high){

                if(array[low] + array[high] == counter){
                    ArrayList tempList = new ArrayList();
                    tempList.add(array[i]);
                    tempList.add(array[low]);
                    tempList.add(array[high]);
                    bigList.add(tempList);

                    while(low < high && array[low] == array[low + 1]) ++low;
                    while(low < high && array[high] == array[high - 1]) --high;

                    ++low; --high;

                }

                else if(array[low] + array[high] > counter){
                    --high;
                }

                else if(array[low] + array[high] < counter){
                    ++low;
                }
            }

        }

        return bigList;


    }

//    public static void addNode(Node head, char data){
//        Node temp = head;
//        while(temp.next != null){
//            temp = temp.next;
//        }
//
//        temp.next = new Node(data);
//    }


//    public static Node insert(Node head, Node node) {
//        if (head == null) {
//            return node;
//        }
//
//        if (node.getData() <= head.getData()) {
//            head.setLeftChild(insert(head.getLeftChild(), node));
//        } else {
//            head.setRightChild(insert(head.getRightChild(), node));
//        }
//
//        return head;
//    }

}




//
//class Node{
//    int data;
//    Node leftChild;
//    Node rightChild;
//
//    Node(int data){
//        this.data = data;
//    }
//
//    public int getData() {
//        return data;
//    }
//
//    public Node getLeftChild() {
//        return leftChild;
//    }
//
//    public void setLeftChild(Node leftChild) {
//        this.leftChild = leftChild;
//    }
//
//    public Node getRightChild() {
//        return rightChild;
//    }
//
//    public void setRightChild(Node rightChild) {
//        this.rightChild = rightChild;
//    }
//}









//class Node{
//    Node next = null;
//    char data;
//
//    Node(char data){
//        this.data = data;
//        this.next = next;
//    }
//}

