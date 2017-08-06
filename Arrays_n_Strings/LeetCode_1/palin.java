
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

        int[] nums = {1, 2, 3, 4, 5, 6, 7, 10, 20, 21};
        int[] indexes = twoSums(nums, 10);


        System.out.println(nums[indexes[0]] + " " + nums[indexes[1]]);


    }

    //Answer

    public static int[] twoSums(int[] array, int target){
        if(array == null){
            return array;
        }

        int frontP = 0;
        int backP = array.length - 1;

        while(frontP < backP){
            if(array[frontP] + array[backP] == target){
                int[] indexes = new int[2];
                indexes[0] = frontP;
                indexes[1] = backP;

                return indexes;
            }

            else if(array[frontP] + array[backP] > target){
                --backP;
            }

            else if(array[frontP] + array[backP] < target){
                ++frontP;
            }
        }

        System.out.println("Nothing");

        return array;
    }

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

