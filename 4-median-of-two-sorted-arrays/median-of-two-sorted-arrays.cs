using System;

public class Solution {
    public double FindMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.Length, n = nums2.Length;
        int[] merged = new int[m + n];
        int i = 0, j = 0, k = 0;

        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                merged[k++] = nums1[i++];
            } else {
                merged[k++] = nums2[j++];
            }
        }
        while (i < m) merged[k++] = nums1[i++];
        while (j < n) merged[k++] = nums2[j++];

        int totalSize = merged.Length;
        if (totalSize % 2 == 0) {
            return (merged[totalSize / 2 - 1] + merged[totalSize / 2]) / 2.0;
        } else {
            return merged[totalSize / 2];
        }
    }
}
