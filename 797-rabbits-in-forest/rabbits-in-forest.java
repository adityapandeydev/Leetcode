class Solution {
    public int numRabbits(int[] answers) {
        Map<Integer, Integer> map = new HashMap<>();
        int result = 0;
        for (int answer : answers) {
            if (answer == 0) {
                result++;
            } else {
                map.put(answer, map.getOrDefault(answer, 0) + 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int groupSize = entry.getKey() + 1;
            int count = entry.getValue();

            int groups = (count + groupSize - 1) / groupSize;
            result += groups * groupSize;
        }

        return result;
    }
}