package Math;

public class NumberOfGoodPairs1512 {

    public int numIdenticalPairs(int[] nums) {
       int left = 0;
       int right = nums.length;
       int count = 0;
       while (right >= left) {
           for (int i = left+1 ; i < right; i++) {
               if (nums[i] == nums[left] ) {
                   count++;
               }
           }
           left++;
       }
       return count;
    }

}
