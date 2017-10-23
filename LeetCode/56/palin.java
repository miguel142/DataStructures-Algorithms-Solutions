
import java.util.*;

public class palin {

    public static void main(String[] args) {

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












