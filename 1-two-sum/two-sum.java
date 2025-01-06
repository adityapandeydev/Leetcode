class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int complement, i = 0;
        for (int num : nums) {
            complement = target - num;
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(num, i);
            i++;
        }
        throw new IllegalArgumentException();
    }
}