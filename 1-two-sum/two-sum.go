func twoSum(nums []int, target int) []int {
    hashmap := make(map[int]int)
    for i, num := range nums {
        complement := target - num
        if idx, found := hashmap[complement]; found {
            return []int{idx, i}
        }
        hashmap[num] = i
    }
    return nil 
}