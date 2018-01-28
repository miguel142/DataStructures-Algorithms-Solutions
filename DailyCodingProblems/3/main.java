public class main {


    public static void main(String args[]){

        Node one = new Node(1);
        Node seven = new Node(7);
        Node five = new Node(5);
        Node fifty = new Node(50);
        Node forty = new Node(40);
        Node ten = new Node(10);


//                   10
//                5      40
//              1    7      50

        Node head = insert(null, ten);
        insert(head, forty);
        insert(head, fifty);
        insert(head, five);
        insert(head, one);
        insert(head, seven);


        String str = "";

        str = createString(head, str);


        System.out.println(str);

        Node newHead = machine(str);

        inOrder(newHead);

    }



    public static Node machine(String str){

        String[] arr = str.split(",");

        Node newHead = insert(null, new Node(Integer.valueOf(arr[0])));
        int count = 1;

        while(count < arr.length){

            if(arr[count].equals("#")){
                ++count;
            }

            else {
                Node curr = new Node(Integer.valueOf(arr[count]));

                insert(newHead, curr);

                count = goLeft(curr, ++count, arr);
            }
        }
        return newHead;
    }

    public static int goLeft(Node newHead, int count, String[] arr){

        Node curr = newHead;


        while(count < arr.length){

            if(arr[count].equals("#")){
                return ++count;
            }

            insert(curr, new Node(Integer.valueOf(arr[count])));

            curr = curr.left;
            ++count;
        }

        return count;



    }





    public static String createString(Node node, String str){

        if(node == null){
            str += "#,";
            return str;
        }

        str += String.valueOf(node.data) + ",";
        str = createString(node.left, str);
        str = createString(node.right, str);

        return str;
    }






    public static Node insert(Node head, Node node) {
        if (head == null) {
            return node;
        }

        if (node.data <= head.data) {
            head.left = insert(head.left, node);

        } else {
            head.right = insert(head.right, node);
        }

        return head;
    }

    public static Node inOrder(Node head){

        if(head == null){
            return head;
        }

        System.out.println(head.data);
        inOrder(head.left);
        inOrder(head.right);


        return head;
    }

    public static class Node{

        Node right;
        Node left;
        int data;

        Node(int data){
            this.data = data;
            left = right = null;
        }

    }
}
