package Matrix;

public class SubrectangleQuery1476 {

    public static void main(String[] args) {
        int[][] ar =  {{1,2,1},{4,3,4},{3,2,1},{1,1,1}};
        SubrectangleQueries subrectangleQueries = new SubrectangleQueries(ar);
        subrectangleQueries.updateSubrectangle(0, 0, 3, 2, 5);
    }

    static class SubrectangleQueries {
        int[][] rectangle;

        public SubrectangleQueries(int[][] rectangle) {
            this.rectangle = rectangle;
        }

        public void updateSubrectangle(int row1, int col1, int row2, int col2, int newValue) {
            for (int i = row1; i <= row2; i++) {
                for (int j = col1; j <= col2; j++) {
                    this.rectangle[i][j] = newValue;
                }
            }
        }

        public int getValue(int row, int col) {
           return this.rectangle[row][col];
        }
    }


}
