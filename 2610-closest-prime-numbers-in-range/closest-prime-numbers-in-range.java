class Solution {
    public int[] closestPrimes(int left, int right) {
        int index = 0;
        int smallest;
        int difference;
        int smallestDifference = Integer.MAX_VALUE;
        List<Integer> list = new ArrayList<>();
        List<Integer> gap = new ArrayList<>();
        int[] ans = new int[2];
        while(left <= right) {
            if (checkPrime(left))
                list.add(left);
            left++;
        }
        for (int i = 0; i < list.size() - 1; i++) {
            difference = list.get(i + 1) - list.get(i);
            gap.add(difference);
            if (difference < smallestDifference) {
                smallestDifference = difference;
                index = i;
            }
        }
        System.out.println(list);
        if (list.size() < 2 || smallestDifference == 0) 
            return new int[]{-1, -1};
        return new int[]{list.get(index), list.get(index + 1)};
    }

    public boolean checkPrime(int num) {
        if (num == 1)
            return false;
        int i = 2;
        while (i * i <= num) {
            if (num % i == 0) {
                return false;
            }
            i++;
        }
        return true;
    }
}