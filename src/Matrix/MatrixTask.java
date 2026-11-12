package Matrix;

public class MatrixTask {
    public static void print(int[][] s) {
        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s[0].length; j++) {
                System.out.print(s[i][j]);
            }
            System.out.println();
        }
    }
}
