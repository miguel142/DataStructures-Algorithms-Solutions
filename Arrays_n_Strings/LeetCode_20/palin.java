
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

        String par = "()()()[()}";
        boolean check = validPar(par);
        System.out.println(check);
    }

    //Answer

    public static boolean validPar(String orig){

        char[] array = orig.toCharArray();
        Stack<Character> st = new Stack<Character>();

        for(int i = 0; i < array.length; i++){
            if(array[i] == '('){
                st.push(')');
            }
            else if(array[i] == '{'){
                st.push('}');
            }
            else if(array[i] == '['){
                st.push(']');
            }
            else if(st.isEmpty() ||  st.pop() != array[i]){
               return false;
            }
        }

        return st.isEmpty();
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

