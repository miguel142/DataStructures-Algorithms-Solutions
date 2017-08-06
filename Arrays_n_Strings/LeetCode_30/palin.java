
import java.util.*;

public class palin {
    public static void main(String[] args) {

//        Node head = new Node(9);
//        addNode(head, 8);
//        addNode(head, 7);
//        addNode(head, 6);
//        addNode(head, 5);
//        addNode(head, 4);
//        addNode(head, 3);
//        addNode(head, 2);
//        addNode(head, 1);
//
//        Node newList = lastNode(head, 3);
//
//        System.out.println(newList.data);

//        while(newList != null){
//            System.out.println(newList.data);
//            newList = newList.next;
//        }

      String str = "abcd ef gh";
      String[] words = {"ab", "gh"};

      ArrayList list = subStr(str, words);


      System.out.println(list);

    }

    //Answer

    public static ArrayList subStr(String str, String[] words) {

        int wordSize = words[0].length();
        char[] array = str.toCharArray();
        ArrayList list = new ArrayList();

        for(int i = 0; i < words.length; i++){

            for(int j = 0; j < str.length(); j++){

                if(str.charAt(j) == words[i].charAt(0)){

                    String subString = str.substring(j, j + words[i].length());

                    if(subString.equals(words[i])){
                        list.add(j);
                    }

                }
            }


        }

        return list;

    }

    //Answer

    //Answer

    //Answer





//    public static char[] swap(char[] word, int front, int back){
//
//    }



        //Answer

        //Answer

//
//    public static void addNode(Node head, int data){
//        Node temp = head;
//        while(temp.next != null){
//            temp = temp.next;
//        }
//
//        temp.next = new Node(data);
//    }

}


//class Node{
//    Node next = null;
//    int data;
//
//    Node(int data){
//        this.data = data;
//        this.next = next;
//    }
//}

