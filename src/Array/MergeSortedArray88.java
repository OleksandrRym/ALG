package Array;

import java.util.Arrays;

/// Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
/// Output: [1,2,2,3,5,6]
/// Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
/// The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.
public class MergeSortedArray88 {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = 0, j = n; i < m; i++) {
            nums1[i] = nums2[j];
            i++;

        }
        Arrays.sort(nums1);
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        merge(nums1, 3, nums2, 3);
    }

}
