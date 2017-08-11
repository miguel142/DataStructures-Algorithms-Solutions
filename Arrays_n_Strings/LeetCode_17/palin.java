
import java.util.*;

public class palin {

    public static void main(String[] args) {

//        Node head = new Node(1);
//        addNode(head, 2);
//        addNode(head, 3);
//        addNode(head, 3);
//        addNode(head, 5);
//        addNode(head, 6);


//
//
//
//       Node head = insert(null, two);
//       insert(head, three);
//       insert(head, four);
//        insert(head, eight);
//        insert(head, five);


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

        String[] phonebook = {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};


        ArrayList list = validPar(phonebook, "23");

        System.out.println(list);
    }

    //Answer

    public static ArrayList validPar(String[] book, String str){

        ArrayList<String> list = new ArrayList<String>();

        char[] digits = str.toCharArray();  //234

        for(int i = 1; i < digits.length; i++){

            char[] firstDigit = book[Character.getNumericValue(digits[0])].toCharArray(); // abc
            char[] nextDigit  = book[Character.getNumericValue(digits[i])].toCharArray(); // def, ghi, etc

            for(int j = 0; j < firstDigit.length; j++){ //for each firsD

                for(int c = 0; c < nextDigit.length; c++){ //for each nextD
                    char[] tempArray  = {firstDigit[j], nextDigit[c]};
                    String tempString = new String(tempArray);
                    list.add(tempString);
                }

            }


        }

        return list;


    }

    //Answer


//    public static void addNode(Node head, int data){
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









class Node{
    Node next = null;
    int data;

    Node(int data){
        this.data = data;
        this.next = next;
    }
}

