package Array;

import static java.lang.Math.max;

public class LongestStrictlyIncreasingOrStrictlyDecreasingSubarray3105 {


    public static int longestMonotonicSubarray(int[] nums) {
        int n = nums.length;
        if(n==1) return 1;
        int lmax =1;
        int incnt =1;
        int dcnt =1;
        for(int i=1;i<n;i++){
            if(nums[i-1]<nums[i]){
                incnt++;
                lmax=max(lmax, incnt);
                dcnt =1;
            }
            else if(nums[i-1]>nums[i]){
                dcnt++;
                lmax=max(lmax, dcnt);
                incnt=1;
            }else{
                incnt=1;
                dcnt=1;
            }
        }
        return lmax;
    }

    public static void main(String[] args) {
        LongestStrictlyIncreasingOrStrictlyDecreasingSubarray3105 l = new LongestStrictlyIncreasingOrStrictlyDecreasingSubarray3105();
        int[] arr = {1, 4, 3, 3, 2};
        System.out.println(l.longestMonotonicSubarray(arr));
    }
}
