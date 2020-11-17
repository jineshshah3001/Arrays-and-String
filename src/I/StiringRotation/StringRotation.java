package I.StiringRotation;

/**
 * Assume you have a method isSubString which checks if one word is a substring of another. Given two strings, S1 and S2,
 * write code to check if S2 is a rotation of S1 using only one call to iSSubString (e.g., "waterbottle" is a rotation
 * of" erbottlewat").
 */
public class StringRotation {

    public static void main(String[] args) {
        System.out.println(isRotation("waterbottle","erbottlewat"));
    }

    private static boolean isRotation(String s1, String s2) {
        if(s1.length() == s2.length()){
            String s1s1 = s1+s1;
            return isSubstring(s1s1,s2);
        }
        return false;

    }

    private static boolean isSubstring(String s1s1, String s2) {
        return true;
    }


}
