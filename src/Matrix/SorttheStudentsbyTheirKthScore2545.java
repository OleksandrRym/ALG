package Matrix;

import java.util.*;

public class SorttheStudentsbyTheirKthScore2545 extends MatrixTask {

    public static void main(String[] args) {
        //[[10,6,9,1],[7,5,11,2],[4,8,3,15]], k = 2
        int[][] arr = {{10,6,9,1},
                {7,5,11,2},
                {4,8,3,15}};
        int k = 2;
        print(sortTheStudents(arr,k));
    }

    /*public static int[][] sortTheStudents(int[][] score, int k) {
        Map<Integer,int[]> map = new TreeMap<>(Comparator.reverseOrder());
        for (int i = 0; i < score.length; i++) {
            map.put(score[i][k], score[i]);
        }
        System.out.println(map.entrySet());
        int count = 0;
        for (Map.Entry<Integer,int[]> entry : map.entrySet()) {
            score[count] = entry.getValue();
            count++;
        }
        return score;
    }*/

    public static int[][] sortTheStudents(int[][] score, int k) {
        PriorityQueue<int[]> queue = new PriorityQueue<>((a,b) -> b[k] - a[k]);
        for (int i = 0; i < score.length; i++) {
            queue.add(score[i]);
        }
        for (int i = 0; i < score.length; i++) {
            score[i] = queue.poll();
        }
        return score;
    }
}
