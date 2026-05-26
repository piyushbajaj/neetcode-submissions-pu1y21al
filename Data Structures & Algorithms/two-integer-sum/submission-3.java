class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Store diff, indices
        Map<Integer, Integer> hashTarget = new HashMap<>();
        int len = nums.length;

        for (int index = 0; index < len; index++) {
            hashTarget.put(nums[index], index);
        }

        for (int index = 0; index < len; index++) {
            int diff = target - nums[index];
            if (hashTarget.containsKey(diff) && hashTarget.get(diff) != index) {
                return new int[] {index, hashTarget.get(diff)};
            }
        }

        return new int[] {};
    }
}
