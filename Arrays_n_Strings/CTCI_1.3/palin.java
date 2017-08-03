public class URLify {

    public static void main(String[]args){
        String str = "Mr John Smith  "; // ['a', 'a', 'b',
        char[] charArray = str.toCharArray();
        int len = 13;
        urlify(charArray, len);

    }

    //URLify Method
    public static void urlify(char[] x, int trueLength){
        int spaceCount = 0;
        int size = 0;
        int[] spaceIndex;

        for(int i = 0; i<trueLength; i++){
            if(x[i] == ' '){
                spaceCount++;
            }
        }
        //End of for loop

        int alter_len = spaceCount*2 + trueLength;
        char[] true_String = new char[alter_len]; //Ouput array has correct length
        int count =0;

        for(int r = 0; r < alter_len; r++){
            if(x[count] == ' '){
                //System.out.println(true_String[r]);
                true_String[r] = '%';
                true_String[++r] = '2';
                true_String[++r] = '0';
            }


            else{
                true_String[r] = x[count];
            }
            count++;
        }
        System.out.println(true_String);    }
}
