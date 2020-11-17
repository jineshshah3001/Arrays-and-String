package B.CheckPermutation;

import java.util.Arrays;

public class CheckPermutationSecondApproach {

    public static void main(String[] args) {
        System.out.println(sort("God").equals(sort("dog")));
        System.out.println(sort("god").equals(sort("dog")));
        System.out.println(sort("jinesh").equals(sort("vikram")));

    }

    private static String sort(String s) {
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
}
