package Math;

import java.util.Arrays;
import java.util.List;

public class FindTriangularSumOfAnArray2221 {
    //1 2 3 4 5
    // 3 5 7 9
    //  8 2 6
    //  0  8
    //   8
    public int triangularSum(int[] nums) {
        if (nums.length == 1 ){
            return nums[0];
        }else {
            int[] arr = new int[nums.length - 1];
            for (int i = 0; i < nums.length - 1; i++) {
                arr[i] = (nums[i] + nums[i+1]) % 10;
            }
            return triangularSum(arr);
        }
    }


    public static void main(String[] args) {
        FindTriangularSumOfAnArray2221 findTriangularSumOfAnArray2221 = new FindTriangularSumOfAnArray2221();
         int[] arr = {1,2,3,4,5};
        System.out.println(
        findTriangularSumOfAnArray2221.triangularSum(arr));
    }
}
