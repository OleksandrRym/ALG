package String;

public class ScoreOfAString3110 {

    public static void main(String[] args) {
        scoreOfString("hello");
    }

    public static int scoreOfString(String s) {
        int firstChar = s.charAt(0);
        int sum = 0, current = 0;
        for (int i = 1; i < s.length(); i++) {
            current = s.charAt(i);
            sum += Math.abs(firstChar - current);
            firstChar = current;
        }
        return sum;
    }

}
