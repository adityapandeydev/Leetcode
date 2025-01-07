func findMedianSortedArrays(nums1 []int, nums2 []int) float64 {
    merged := []int{}
    i, j := 0, 0

    for i < len(nums1) && j < len(nums2) {
        if nums1[i] < nums2[j] {
            merged = append(merged, nums1[i])
            i++
        } else {
            merged = append(merged, nums2[j])
            j++
        }
    }
    merged = append(merged, nums1[i:]...)
    merged = append(merged, nums2[j:]...)

    totalSize := len(merged)
    if totalSize%2 == 0 {
        return float64(merged[totalSize/2-1]+merged[totalSize/2]) / 2.0
    }
    return float64(merged[totalSize/2])
}
