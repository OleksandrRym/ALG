package Math;

public class FindTriangularSumOfAnArray2221 {
    //1 2 3 4 5
    // 3 5 7 9
    //  8 2 6
    //  0  8
    //   8
    public int triangularSum1(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        } else {
            int[] arr = new int[nums.length - 1];
            for (int i = 0; i < nums.length - 1; i++) {
                arr[i] = (nums[i] + nums[i + 1]) % 10;
            }
            return triangularSum1(arr);
        }
    }

    public int triangularSum2(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - i - 1; j++) {
                nums[j] = (nums[j] + nums[j + 1]) % 10;
            }
        }

        return nums[0];
    }


    public static void main(String[] args) {
        FindTriangularSumOfAnArray2221 findTriangularSumOfAnArray2221 = new FindTriangularSumOfAnArray2221();
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(findTriangularSumOfAnArray2221.triangularSum2(arr));
    }
}
