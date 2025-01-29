package HashTable;

import java.util.*;
import java.util.stream.Collectors;

public class IntersectionOfTwoArrays349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<nums1.length; i++){
            if(!set.contains(nums1[i])){
                set.add(nums1[i]);
            }
        }
        HashSet<Integer> res = new HashSet<>();
        for(int i=0; i<nums2.length; i++){
            if(set.contains(nums2[i]) && !res.contains(nums2[i])){
                res.add(nums2[i]);
            }
        }
        int[] result = new int[res.size()];
        int index = 0;
        for (int num : res) {
            result[index++] = num;
        }

        return result;
    }
}
