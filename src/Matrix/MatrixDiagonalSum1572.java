package Matrix;

public class MatrixDiagonalSum1572 extends MatrixTask {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3,11},
                {4,5,6,1},
                {7,8,9,1}};
        int[][] arr2 = {{5}};
        int[][] arr3 = {{1, 1, 1,1},
                {1,2,2,1},
                {1,2,2,1},
                {1,1,1,1}};
        System.out.println(diagonalSum(arr3));
    }

    public static int diagonalSum(int[][] mat) {
        int res = 0;
        int piv = 0;
        if (mat.length % 2 != 0){
            res -=  mat[mat.length/2][mat[0].length/2];
        }
        for (int i = 0; i < mat.length; i++) {
            res += mat[i][piv] + mat[i][mat[0].length-1-piv];
            piv++;
        }
        return res;
    }
}
