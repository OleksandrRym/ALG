package TwoPointers;

import java.util.Arrays;

public class RotateArray189 {
        public void rotate(int[] nums, int k) {
            int n = nums.length;
            k = k % n;
            int[] temp = new int[k];
            System.arraycopy(nums,n-k,temp,0,k);
            System.arraycopy(nums,0,nums,k,n-k);
            System.arraycopy(temp,0,nums,0,k);
        }


    public static void main(String[] args) {
        RotateArray189 rotateArray189 = new RotateArray189();
        int[] ar = {1,2,3,4,5,6,7,8};
        rotateArray189.rotate(ar , 3);
    }
}
