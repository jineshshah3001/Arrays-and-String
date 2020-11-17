package B.CheckPermutation;

/**
 * Given two Strings, write a method to decide if One is a permutation of the other.
 */
public class CheckPermutation {
    public static void main(String[] args) {
        System.out.println(permutation("God","dog"));
        System.out.println(permutation("god","dog"));
        System.out.println(permutation("jinesh","vikram"));
    }

    private static boolean permutation(String s, String t) {
        if( s.length() != t.length()){
            return false;
        }
        int[] arr = new int[128];
        for(int i = 0 ; i < s.length() ; i++){
            arr[s.charAt(i)]++;
        }

        for(int i= 0 ; i < t.length() ; i++){
            arr[t.charAt(i)]--;
            if(arr[t.charAt(i)] < 0){
                return false;
            }

        }
        return true;
    }
}
