package A.IsUnique;

/**
 * Implement an algorithm to determine if a string has all unique characters. What if you cannot use additional data
 * structures?
 */
public class IsUnique {

    public static void main(String[] args) {
        System.out.println(isUnique("jinesh"));
        System.out.println(isUnique("anand"));
    }

    private static boolean isUnique(String str) {
        if(str.length() > 128){
            return false;
        }
        boolean arr[] = new boolean[128];
        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i);
            if (arr[val]) {
                return false;
            }
            arr[val] = true;
        }
        return true;
    }
}

/*
 * Time Complexity - O(n) -> n is the length of the String.
 * Space Complexity - O(1)
 * If we cannot use additional data structures, we can do following
 * 1) Compare every character of the String to every other character of the String. This will take O(n^2) time and O(1)
 *    space.
 * 2) If we are allowed to modify the input String, we can sort the String in O(n log n) time and then check the String
 *    for neighbouring characters that are identical.
 */
