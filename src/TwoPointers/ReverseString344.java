package TwoPointers;

public class ReverseString344 {

    String[] s = {"h", "e", "l", "l", "o"};

    public void reverseString(char[] s) {
        int left = 0, right = s.length - 1;
        char temp;
        while (left < right) {
            temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }

}
