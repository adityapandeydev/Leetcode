function findMedianSortedArrays(nums1: number[], nums2: number[]): number {
    const merged: number[] = [];
    let i = 0, j = 0;

    while (i < nums1.length && j < nums2.length) {
        if (nums1[i] < nums2[j]) {
            merged.push(nums1[i++]);
        } else {
            merged.push(nums2[j++]);
        }
    }
    while (i < nums1.length) merged.push(nums1[i++]);
    while (j < nums2.length) merged.push(nums2[j++]);

    const totalSize = merged.length;
    if (totalSize % 2 === 0) {
        return (merged[totalSize / 2 - 1] + merged[totalSize / 2]) / 2;
    } else {
        return merged[Math.floor(totalSize / 2)];
    }
}
