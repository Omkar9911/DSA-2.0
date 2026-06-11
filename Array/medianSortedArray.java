/*
Median of Two Sorted Arrays
        Solved
        Hard
        Topics
        premium lock icon
        Companies
        Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.

        The overall run time complexity should be O(log (m+n)).



        Example 1:

        Input: nums1 = [1,3], nums2 = [2]
        Output: 2.00000
        Explanation: merged array = [1,2,3] and median is 2.
        Example 2:

        Input: nums1 = [1,2], nums2 = [3,4]
        Output: 2.50000
        Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
        */

package Array;

import java.util.Arrays;

public class medianSortedArray {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double ans = 1;

        int[] merge = new int[(nums1.length + nums2.length)];
        System.arraycopy(nums1, 0, merge, 0, nums1.length);
        System.arraycopy(nums2, 0, merge, nums1.length,  nums2.length);
        Arrays.sort(merge);

        if(merge.length % 2 != 0){
            ans = merge[ (merge.length / 2)];

        } else {
            double tem  = (merge[ (merge.length / 2)]) +  (merge[ (merge.length / 2)- 1 ]);
            ans = tem / 2;
        }

        return ans;
    }
}
