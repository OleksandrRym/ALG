package String;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static java.util.Arrays.*;

public class FindTheDifference389 {
    public static char findTheDifference(String s, String t) {
        char[] a = s.toCharArray();
        char[] b = t.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        for (int i = 0; i < a.length; i++) {
            if (b[i] != a[i]) {
                return b[i];
            }
        }
        return b[b.length - 1];
    }

    public static void main(String[] args) {
        findTheDifference("sasdss","asd");
    }
}
//Input: s = "abcd", t = "abcde"
//Output: "e"
//Explanation: 'e' is the letter that was added.