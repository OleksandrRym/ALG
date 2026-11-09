package Matrix;

public class LargerLocalValuesInMatrix2373 {
    public static void main(String[] args) {
        int[][] arr = {{9, 9, 8, 1},
                        {5, 6, 2, 6},
                        {8, 2, 6, 4},
                        {6, 2, 2, 2}};

        var res = largestLocal(arr);

        print(res);
    }

    private static void print(int[][] s) {
        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s.length; j++) {
                System.out.print(s[i][j]);
            }
            System.out.println();
        }
    }

    public static int[][] largestLocal(int[][] grid) {
        int[][] window = new int[grid.length - 2][grid.length - 2];
        for (int i = 1; i < grid.length - 1; i++) {
            for (int j = 1; j < grid.length - 1; j++) {
                window[i - 1][j - 1] = countWindow(grid, i, j);
            }
        }
        return window;
    }

    public static int countWindow(int[][] grid, int i, int j) {
        int max = Integer.MIN_VALUE;
        for (int k = i - 1; k <= i + 1; k++) {
            for (int l = j - 1; l <= j + 1; l++) {
                max = Math.max(grid[k][l], max);
            }
        }
        return max;
    }
}
