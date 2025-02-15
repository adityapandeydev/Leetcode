class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int c = 0;
        for(int i = m; i < nums1.length; i++) {
            nums1[i] = nums2[c];
            c++;
        }
        boolean flag = true;
        int temp;
        while(flag) {
            flag = false;
            for(int i = 0; i < nums1.length - 1; i++) {
                if(nums1[i] > nums1[i + 1]) {
                    temp = nums1[i];
                    nums1[i] = nums1[i + 1];
                    nums1[i + 1] = temp;
                    flag = true;
                }
            }
        }
    }
}