package C.URLify;

/**
 * Write a method to replace all spaces in a string with '%20'. You may assume that the string has sufficient space at
 * the end to hold the additional characters, and that you are given the "true" length of the string.
 * (Note: if implementing in Java, please use a character array so that you can perform this operation in place.)
 * EXAMPLE
 * Input: "Mr John Smith", 13
 * Output: "Mr%20John%20Smith"
 */
public class URLify {
    public static void main(String[] args) {

        String inputString = "Mr John Smith    ";
        char[] input = inputString.toCharArray();
        char[] output = URIfyString(input,13);
        for(int i = 0;i<output.length;i++){
            System.out.print(output[i]);
        }
    }

    private static char[] URIfyString(char[] input, int trueLength) {

        int spaceCount = 0;
        for(int i = 0 ;i < trueLength;i++){
            if(input[i] == ' '){
                spaceCount++;
            }
        }

        int index = trueLength + spaceCount*2;

        for(int i = trueLength -1 ; i>=0;i--){
            if(input[i] == ' '){
                input[index-1] = '0';
                input[index-2] = '2';
                input[index-3] = '%';
                index -=3;
            }
            else{
                input[index-1] = input[i];
                index--;
            }
        }
        return input;

    }
}
