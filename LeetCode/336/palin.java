
import java.lang.reflect.Array;
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


//        Node head1 = new Node(20);
//        Node one1 = new Node(8);
//        Node two1 = new Node(4);
//        Node three1 = new Node(12);
//        Node four1 = new Node(10);
//        Node five1 = new Node(14);
//        Node six1 = new Node(22);
//
//        insert(head1, one1);
//        insert(head1, two1);
//        insert(head1, three1);
//        insert(head1, four1);
//        insert(head1, five1);
//        insert(head1, six1);



                                                //          //          //
        //String[] results = {"1, 234", "2, 345", "2, 645", "2, 2445","1, 8943", "5, 234", "3, 234", "8, 456", "9, 645", "10, 345", "11, 345"};


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


        String[] str = {"abcd", "dcba", "lls", "s", "sssll"};


        System.out.println(median(str));


    }


    public static ArrayList<ArrayList<Integer>> median(String[] words){

        HashMap<String, Integer> map = new HashMap<>();
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        for(int i = 0;  i < words.length; i++){


            for(int j = 0; j < words.length; j++){
                StringBuilder build = new StringBuilder();
                build.append(words[i]);
                if(j != i){

                    build.append(words[j]);

                    if(check(build.toString())){
                        ArrayList<Integer> set = new ArrayList<>();

                        set.add(i);
                        set.add(j);

                        list.add(set);
                    }
                }
            }
        }

        return list;

    }

    public static boolean check(String str){

        char[] arr = str.toCharArray();
       int front = 0;
       int back = arr.length - 1;


       while(front < back){
           if(arr[front] != arr[back]){
               return false;
           }

           ++front;
           --back;
       }

        return true;
    }

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
//        inOrder(head.left);
//        inOrder(head.right);
//        System.out.println(head.data);
//
//
//        return;
//    }


//
//    public static String[] compress(String[] results, int num){
//
//        HashSet<String> set = new HashSet<>();                  //our unique value buffer
//        ArrayList<String> list = new ArrayList<>();             //holds our answer in the correct order
//        LinkedList<String> link = new LinkedList<>();           // our que to hold skipped strings
//        HashMap<String, StringBuilder> map = new HashMap<>();   //map to hold id's for each string in que
//        int count = 0;                                          //counter for current page amount
//
//
//        /*Loop through each string in results, then process if it
//        goes to the que or our results
//         */
//
//        for(int i = 0; i < results.length; i++){
//
//            StringBuilder id = new StringBuilder();            //holds our id for each string
//            boolean check = false;                             //checks if string is a valid input
//
//            //appends id unitl it hots a comma
//            for(int j = 0; j < results[i].length(); j++){
//
//                if(results[i].charAt(j) == ','){
//                    map.put(results[i], id);
//                    check = true;
//                    break;
//                }
//
//                id.append(results[i].charAt(j));
//            }
//
//            //the body of code to check if it goes in que or results
//            if(check == true) {
//
//                if (!link.isEmpty()) {
//                    int index = 0;
//
//                        //We deque until its not unique or que empty
//                        while(index < link.size()){
//
//                            if(!set.contains(map.get(link.get(index)).toString())) {
//                                set.add(map.get(link.get(index)).toString());
//                                list.add(link.get(index));
//                                link.remove(index);
//                                ++count;
//
//                                //checks if we maximized amount in page, we reset
//                                if (count == num) {
//                                    set.clear();
//                                    list.add("");
//                                    count = 0;
//                                }
//                            }
//
//                            else{
//                                ++index;
//                            }
//                        }
//                }
//
//                //if id is in set we add to que instead of adding into our results
//                if(set.contains(id.toString())) {
//                    link.add(results[i]);
//                } else {
//                    set.add(id.toString());
//                    list.add(results[i]);
//                    ++count;
//                }
//
//                //our page checker
//                if (count == num) {
//                    set.clear();
//                    list.add("");
//                    count = 0;
//                }
//
//            }
//
//        }
//
//
//        /*this is our final step in case we iterated through the whole array,
//        and there isn't any more unique strings for the final pages,
//        then we add the rest to our results.
//         */
//
//        for(int i = 0; i< link.size(); i++){
//
//            list.add(link.remove(i));
//            ++count;
//
//            if(count == num){
//                list.add("");
//                count = 0;
//            }
//        }
//
//        String[] ans = list.toArray(new String[list.size()]);    //move our answers into an array
//
//        return ans;
//
//    }

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






//
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

//class Node{
//    int label;
//    LinkedList<Node> childs = new LinkedList<>();
//
//     Node(int data){
//        this.label = data;
//        childs = new LinkedList<Node>();
//    }
//
//    public Node getNode(int source, int edge){
//
//    }
//
//}













