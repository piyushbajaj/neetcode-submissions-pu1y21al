class Solution {
    public int longestConsecutive(int[] nums) {
       HashSet<Integer> hashSet = new HashSet<>();
        for (int num : nums) {
            hashSet.add(num);
        }

        int maxCount = 0;

        for (int num : nums) {
            if (!hashSet.contains(num - 1)) {
                int count = 1;
                while (hashSet.contains(num + count)) {
                    count++;
                }

                maxCount = Math.max(maxCount, count);
            }
        }

        return maxCount; 
    }
}
