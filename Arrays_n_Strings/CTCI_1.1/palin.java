public class palin {
    public static void main (String args[]){
        String word = "Pleas"; //Pleas returns true || Please returns false (Two e’s)
        boolean answer = permutation(word);
        System.out.print(answer);
    }

    public static boolean permutation(String str){
        boolean[] charArray = new boolean[128];  //Create a boolean array for all possible chars
        //Run for loop to go through array
        for(int i =0 ; i < str.length(); i++){    
int val = str.charAt(i);

            if(charArray[val]){
                return false;
            }
            charArray[val] = true;
        }
        return true;
    }
}
