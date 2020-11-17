package F.StringCompression;

/**
 * Input -> aabcccccaaa
 * Output -> a2b1c5a3
 * If the compressed string would not become smaller than the original string, your method should return the original
 * string.
 */
public class StringCompression {

    public static void main(String[] args) {
        System.out.println(compressString("aabcccccaaa"));
        System.out.println(compressString("abcd"));
    }

    private static  String compressString(String input) {
        StringBuilder result = new StringBuilder();
        int countConsecutive = 0;
        for(int i = 0; i<input.length();i++){
            countConsecutive++;
            if(i+1 == input.length() || input.charAt(i)!=input.charAt(i+1)){
                result.append(input.charAt(i));
                result.append(countConsecutive);
                countConsecutive = 0;
            }
        }
        return result.length() > input.length() ? input : result.toString();
    }
}
